package a_classes;
// Nested class 
class Outer
{
	class Inner
	{
		public void show() 
		{
			System.out.println("calling show method from inner class");
		}
	}
	public void test() 
	{
		System.out.println("calling test method from outer class");
	}
}
public class NestedClass {

	public static void main(String[] args) {
		
		Outer out=new Outer();
		out.test();
		//out.show(); error(Invalid)
		//if we want to call method from nested class then
		Outer.Inner oi=new Outer().new Inner();
		oi.show();
		//we can not access test method by nested  class object
		//oi.tast();
		
	}

}