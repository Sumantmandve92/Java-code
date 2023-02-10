package g_encapsulation;

class Test {
	//all the variables declared in this(POJO) class should be private
	//and have its respective getter and setter methods
	private String userName, password;
	// setters

	public void setUserName(String userName) {

		this.userName = userName;
	}

	public void setPassword(String password) {

		this.password = password;
	}
	//getters
	public String getUserName() {
		return userName;
	}
	
	public String getPassword()
	{
		return password;
	}
}

public class MyClass {

	
	public static void main(String[] args) {
		Test test = new Test();
		test.setUserName("rahul");
		test.setPassword("***");
		System.out.println("UserName: "+test.getUserName());
		System.out.println("Password: "+test.getPassword());
	
				

	}

}
