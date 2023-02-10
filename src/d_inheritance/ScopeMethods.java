package d_inheritance;


interface G
{
	static int s=0;
	void m1();
	static void m2() 
	{
		System.out.println("hi");
	}
}
class A implements G
{

	@Override
	public void m1() {
		System.out.println("hello");
		
	}
	static void m2() {};
	
}

public class ScopeMethods {

	public static void main(String[] args) {

String string="java\tis\ta\tprogramming\tlanguage".strip();
System.out.println(string);
System.out.println("000000000000000000000000000000000000000000000000000000000");
		G a=new A();
		

	}

}
