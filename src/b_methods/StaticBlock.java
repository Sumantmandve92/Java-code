package b_methods;


//as the controller enter into the class he search static block first then execute all static block of that class ,then execute other data members 
public class StaticBlock {

	public static void main(String[] args) {
		
		 Simple.getData();
		 Simple.display();
	}
	static 
	{
		System.out.println("End");
	}

}
class Simple
{
	
	static 
	{
		System.out.println("START");
	}
	static int a,b=20;
	static void getData() 
	{
	System.out.println("a = "+a);	
	}
	static void display() 
	{
		System.out.println("b = "+b);
	}
	static 
	{
		System.out.println("Samsung Mobile");
		a=4*b;
	}
}
