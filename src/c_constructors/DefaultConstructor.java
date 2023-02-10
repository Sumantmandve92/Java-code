package c_constructors;


//this() : call all default constructor present in the child and super and grand parent class 
public class DefaultConstructor {

	public static void main(String[] args) {
	
		new ChildClass("hi");

	}

}
class Test
{
	public Test()
	{
		System.out.println("%");
	}	
}
class BaseClass extends Test
{
	 public BaseClass() {
		System.out.print("*");
	}
	 BaseClass(String str)
	 {
		 this();
		 System.out.print("@"+str);
	 }
}
class ChildClass extends BaseClass
{
	public ChildClass() {
		System.out.print("#");
	}
	ChildClass(String name)
	{
		this();
		System.out.print("$"+name);
	}
}
