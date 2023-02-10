package cc_StaticBlocks;

class Test
{
	static int a;
	static 
	{
		a=9;
		System.out.println("static block");
		System.out.println(a);
	}
	 Test() {
		a=10;
		System.out.println("constructor block");
	
	}
	public static void print() 
	{
		a=a+20;
		System.out.println(a);
	} 
	
}
public class Static_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test test=new Test();
		test.print();
	}

}
