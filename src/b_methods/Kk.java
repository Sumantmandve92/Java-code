package b_methods;
//jvm call only main method of public class
public class Kk 
{	
	public static void main(String[] args) 
	{
		//str.118
		IssueRises ir = new IssueRises();
		System.out.println(ir.myIssue);
	}
}

class IssueRises {
	public String myIssue = "Issue not fixed";
	public void IssueRises() {
		myIssue = "Issue is Fixed";
	}
	public static void main(String[] args) {
		IssueRises ir = new IssueRises();
		System.out.println(ir.myIssue);
	}
}



