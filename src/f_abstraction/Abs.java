package f_abstraction;

public class Abs {

	public static void main(String[] args) {
		
		B b=new B();   
		// as non args object  is created it  calls the  constructor B .
		//as  class A extends B  so this object will call constructor B also but this constructor is of same structure

	}

}
abstract class A
{
	A()
	{
		System.out.println("constructor of A class");
	}
	
	
}
class B extends A
{
	B()
	{
		
		System.out.println("constructor of B class");
	}

}
