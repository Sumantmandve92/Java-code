package f_abstraction;

abstract public class ClassMembers {
	
	//In abstract class following members can declare
	//(1):abstract methods(one to many).................................................
	abstract void test();
	//(2):non abstract methods and static method also.....................................................................
	void demo() 
	{
		
	}
	// (3)we can make final method also to not to change body of that method
	//(3):constructors(no args/args).................................................................
	public ClassMembers(int a)
	{
		this.a=a;
	}
	//(4):instance var.............................................................................
	int a;
	//(5):main method also we can add..........................................................
	public static void main(String[] args) {


	}

}
class Demo extends ClassMembers
{
	
	

	public Demo(int a) 
	{
		super(a);
	}

	void data() 
	{
	
	
	}

	//Rule: If you are extending an abstract class that has an abstract method,
	//you must either provide the implementation of the method or make this class abstract.
	@Override
	void test()
	{
				System.out.println("Implementation of abstract method");
	}
}
/*
 * 1)we can not instantiate abstract class (never create object of abstract class)  
 * 2) only public and protected access modifier given to the abstract method
 * 3) we can not make a static method as abstract 
 * 4) constructor can not be abstract(most important:constructor has property  from its birth that
 * 		i)when we create two or more constructor in same class then we bound to give same as class name (by default overloading achieved)
 * 		ii)but we can not override it because we are bound to declare constructor by class name ,so how can we override in different classes...
 * we know that abstraction is achieved by overriding for define date members in inherited class and we can't override constructor .
 * so constructor can never be abstract}
 * 
 */