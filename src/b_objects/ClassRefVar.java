package b_objects;
class Basic
{
	public static void show() 
	{
		System.out.println("basic show");
	}
}
class Base extends Basic
{
	public static void show() 
	{
		System.out.println("Base::show() method of Base class ");
	}

}
class Derived extends Base
{
	public static void show() 
	{
		System.out.println("show method of Derived  class ");
	}
}

//main class
public class ClassRefVar {

	public static void main(String[] args) 
	{
	   Basic base=new Derived();
	   
	   base.show();

	}

}
