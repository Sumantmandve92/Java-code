package f_abstraction;

public class InterfaceMembers {

	public static void main(String[] args) {
	

	}

}
interface I1
{	 //it can not be instantiated (never create an object of interface)
	//(1)all methods are of abstract type except we can create non abstract method by 'default ' keyword
	//.........................................................................................................
	abstract public void m0();
	//these abstract method we need not to write 'abstract public' so compiler  will give automatically
	
	void m1();
	void m2();
	
	//(2):non abstract method by default keyword...........................................................
	default void m3() 
	{
		System.out.println("Hii..");
	}
	
	//(3):non abstract method by 'static ' keyword
	static  void m4() 
	{
		
	}
	// (4):Instance variable are 'public static final ' by default .we need not to write these keys before the instance var.
	int a=10;
	public static final int b=20;
	//as the instance variables are 'declared' and 'initialized' and they are 'final' also that is why we need not to create constructor of  interface
	
	
	
}
