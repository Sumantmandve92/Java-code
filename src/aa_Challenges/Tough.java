


//The Java documentation exercise in this document is designed to not only test your knowledge of Java, but also give you an idea of the type of work we do at EvolveWare when extracting business rules from applications. 
//The goal is to document both business and process rules.  Logic to be documented as business rules contain specific code  related to business decisions.  All other logic that does not contain business rules is typically considered to be process rules.
//
//Please review the Java code below.  Add method level documentation explaining the purpose of the method
//1.	Add statement level documentation explaining the purpose of each statement.  If you are unable to determine the purpose for a given statement, document as UNKNOWN.
//2.	Highlight all of your additions using the yellow highlighter.

/*
 * Author - Exercise.
 * v1.0
 * 2015
 */
package eapplication.action;

import common.helper.ServiceHelper;
import common.ldap.Person;
import common.ldap.UserAccountException;
import common.ldap.UserAlreadyExistsException;
import common.ldap.UserPasswordException;
import common.services.ApplicationEnvironmentManager;
import common.services.ServiceManager;
import common.util.ValidationUtil;
import common.web.interceptor.ExceptionLogger;
import eapplication.ejb.AdministrationEJBLocal;
import eapplication.ejb.SecurityEJBLocal;
import eapplication.helper.AccountCreationWrapper;
import eapplication.helper.EAppSessionManager;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.mysql.cj.conf.BooleanPropertyDefinition.AllowableValues;


public class NewAccountCreation<AccountCreationWrapper> extends EApplicationBaseAction {

	/** The Constant serialVersionUID. */
	private static final long      serialVersionUID = 3510639087671822117L;
	/** The Constant LOG. */
//	getLogger method returns the object of NewAccountCreation class
	private static final Logger    LOG              = Logger.getLogger(NewAccountCreation.class);    
	/** MAX_FAIL_COUNT */
	private static final int       MAX_FAIL_COUNT   = 5;    
	/** The account creation. */
	private AccountCreationWrapper accountCreation;    
	private boolean                invalidLogin;    
	/** The policyAgreement. */
	private boolean                policyAgree;    
	private boolean                validate;    
	private String                 county;
	private boolean                dawsServiceFlag;


	public String input() {
//		method debug called from logger class
		LOG.debug("Setting audit entries from session");
//		returned value from getSession( ) method passed to removeAccountCreationAuditParamFromSession
		EAppSessionManager.removeAccountCreationAuditParamFromSession(getSession());
//		here turnary operator is used to get boolean value if Y and value get from the ServiceHelper.retrieveConfigurationPropertyValue("myb.daws.service.enabled") is matched
		dawsServiceFlag = "Y".equalsIgnoreCase(ServiceHelper.retrieveConfigurationPropertyValue("myb.daws.service.enabled")) ? true : false;
//		if condition in if parenthesis is true invalid login will be true
		if (getUserProfile() != null && StringUtils.isNotBlank(getUserProfile().getId())) {
			invalidLogin = true;
			addActionError(getText("AccountCreation.validation.alreadyLoggedIn", new String[] {
					getUserProfile().getId()
			}));
		}
		return INPUT;
	}


	public String execute() throws Exception {
//		the how many attempts are failed returned from the method getInvalidAttemptsFromSession(getSession()) is assigned to failCount
		int failCount = EAppSessionManager.getInvalidAttemptsFromSession(getSession());
//		if failcount is greater than MAX_FAIL_COUNT  then attempt applied is removed from session manager and you returned to home page
		if (failCount >= MAX_FAIL_COUNT) {
			EAppSessionManager.removeInvalidAttemptsFromSession(getSession());
			return goHome(null);
		}
//		then object of person  should be nullified
		Person person = null;
		try {
//			here instance of AdministrationEJBLocal is returned by getService of ServiceManager and stored in AdministrationEJBLocal
			AdministrationEJBLocal adminEJB = ServiceManager.getService(AdministrationEJBLocal.class);
//			same here SecurityEJBLocal instance is created
			SecurityEJBLocal ejb = ServiceManager.getService(SecurityEJBLocal.class);
//			the new person is created
			person = buildPerson();
//			
			ejb.createCitizenUserAccount(person);
			adminEJB.saveAccountCreationAudit(person, "NewAccountCreation");
		} catch (UserPasswordException uaen) {
			LOG.error("LDAPAccountCreation.validation.userPasswordException;" + getText("LDAPAccountCreation.validation.userPasswordException"));
			if (!isProd())
				LOG.error("User account[" + person + "] account in myBenefits. UserPasswordException:" + ExceptionLogger.buildStackTrace(uaen, this));
			// addActionError("Account Password format is not correct, please correct the password entry according to the text displayed on screen.");
			addActionError(getText("LDAPAccountCreation.validation.userPasswordException"));
			return INPUT;
		} catch (UserAlreadyExistsException uaee) {
			LOG.error("LDAPAccountCreation.validation.userAlreadyExists;" + getText("LDAPAccountCreation.validation.userAlreadyExists"));
			if (!isProd())
				LOG.error("User account[" + person + "] account. UserAlreadyExistsException:" + ExceptionLogger.buildStackTrace(uaee, this));
			addActionError(getText("LDAPAccountCreation.validation.userAlreadyExists"));
			return INPUT;
		} catch (UserAccountException uae) {
			LOG.error("LDAPAccountCreation.validation.userAlreadyExists;" + getText("LDAPAccountCreation.validation.userAlreadyExists"));
			if (!isProd())
				LOG.error("User account[" + person + "] account. UserAccountException:" + ExceptionLogger.buildStackTrace(uae, this));
			addActionError(getText("LDAPAccountCreation.validation.userAlreadyExists"));
			return INPUT;
		} catch (Exception e) {
			if (!isProd())
				LOG.error("Unable to register new account. Error:" + ExceptionLogger.buildStackTrace(e, this));
			return goHome(getGenericApplicationErrorText());
		}
//		in above catch all exceptions are handled 
//		if All exception are not handled then next will not be returned
		return NEXT;
	}

// this method is called when number of failed attempts is greater than max fail count 
	private String goHome(String msgKey) {
		if (StringUtils.isNotEmpty(msgKey)) {
			EAppSessionManager.putHomePageErrorMessageKeyInSession(getSession(), getText(msgKey));
		}
		return PUBLIC_HOME;
	}

// account of person is created using this method and  returned in person object  when number of failed attempts is greater than max fail count
	private Person buildPerson() {
		Person person = new Person();
		person.setFirstName(accountCreation.getName().getFirstName());
		person.setLastName(accountCreation.getName().getLastName());
		person.setMiddleInitial(accountCreation.getName().getMiddleInitial());
		person.setLogonId(accountCreation.getUserId());
		person.setPassword(accountCreation.getPassword());
		person.setEMail(accountCreation.getEmailAddress());
		person.setAllowedEnvironment(ApplicationEnvironmentManager.getPropertyValue("ldap.environmentAttribute"));
		return person;
	}


	public void validate() {
		//        int failCount = EAppSessionManager.getInvalidAttemptsFromSession(getSession());
		validateNames();
		validateUserIdPasswordandEmail();
		if (isNoCaptchaEnabled())
			validateaNoCaptchaV2();
		else {
			if (!isPseudo())
				validateaReCaptchaV1();
		}
		if (hasActionErrors()) {
			//            failCount++;
			//            EAppSessionManager.putInvalidAttemptsInSession(getSession(), Integer.valueOf(failCount));
			validate = true;
		}
	}


	/**
	 * Validates user input names.
	 */
	private void validateNames() {
		List<Object> sub = new ArrayList<Object>();

		if (StringUtils.isBlank(getAccountCreation().getName().getFirstName())) {
			addActionError(getText("validation.firstName.isEmpty"));
		}
		if (StringUtils.isBlank(getAccountCreation().getName().getLastName())) {
			addActionError(getText("validation.lastName.isEmpty"));
		}
		if (!getAccountCreation().getName().getFirstName().equals("")) {
			if (!ValidationUtil.isAlphaHyphAposSpaceOnly(getAccountCreation().getName().getFirstName())) {
				sub.add(getText("individual.firstName"));
				addActionError(getText("validate.AlphaNumeric", sub));
				sub.clear();
			}
		}

		if (!this.getAccountCreation().getName().getLastName().equals("")) {
			if (!ValidationUtil.isAlphaHyphAposSpaceOnly(getAccountCreation().getName().getLastName())) {
				sub.add(getText("individual.lastName"));
				addActionError(getText("validate.AlphaNumericLastName", sub));
				sub.clear();
			}
		}
		if (!this.getAccountCreation().getName().getFirstName().equals("")) {
			if (!ValidationUtil.isInvalidFirstChar(getAccountCreation().getName().getFirstName())) {
				sub.add(getText("individual.firstName"));
				addActionError(getText("validate.SpecialAlphaNumeric", sub));
				sub.clear();
			}
		}
		if (!this.getAccountCreation().getName().getLastName().equals("")) {
			if (!ValidationUtil.isInvalidFirstChar(getAccountCreation().getName().getLastName())) {
				sub.add(getText("individual.lastName"));
				addActionError(getText("validate.SpecialAlphaNumeric", sub));
				sub.clear();
			}
		}
	}

//this method returns the instance of  AccountCreationWrapper wherever this method called
	public AccountCreationWrapper getAccountCreation() {
		return accountCreation;
	}


//this setter method  will set the instance of AccountCreationWrapper
	public void setAccountCreation(AccountCreationWrapper accountCreation) {
		this.accountCreation = accountCreation;
	}
// here all validation set in instance variable
	public boolean isInvalidLogin() {
		return invalidLogin;
	}


	public void setInvalidLogin(boolean invalidLogin) {
		this.invalidLogin = invalidLogin;
	}

	public boolean isPolicyAgree() {
		return policyAgree;
	}


	public void setPolicyAgree(boolean policyAgree) {
		this.policyAgree = policyAgree;
	}


	public boolean isValidate() {
		return validate;
	}


	public void setValidate(boolean validate) {
		this.validate = validate;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public boolean isDawsServiceFlag() {
		return dawsServiceFlag;
	}

	public void setDawsServiceFlag(boolean dawsServiceFlag) {
		this.dawsServiceFlag = dawsServiceFlag;
	}    
}
