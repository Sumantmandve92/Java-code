package Basics;

public class DemoClass  {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	B ob = new B();
		ob.m1();
		ob.m2();

	}
}
class A
{
	void m1() 
	{
		System.out.println("Calling method m1 from class A");
	}
	
}
class B extends A
{
	void m2() 
	{
		System.out.println("Calling method m2 from class B");
	}
	
}