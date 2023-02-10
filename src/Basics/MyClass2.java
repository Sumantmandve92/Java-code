package Basics;

public class MyClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example e1=new Example();
		Example e2=new Example(30);
		Example e3=new Example(30,40);
		e1.display();
		e3.display();
		e2.display();
	}

}
class Example
{
	int v1;
	int v2;
	Example()
	{
		v1=10;
		v2=20;
		System.out.println(" first non parameterized constructor");
	}
	Example(int a)
	{
		v1=a;
		System.out.println("  second parameterized constructor");
	}
	Example(int b,int c)
	{
		v1=b;
		v2=c;
		System.out.println("  third parameterized constructor");
	}
	public  void display() 
	{
		System.out.println(v1+" "+v2 );
	}
}
