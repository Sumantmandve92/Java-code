package e_superkeyword;

class A
{
	public int i;
	private int j;
	int a=j;
}
class B extends A
{
	void display() 
	{
		System.out.println("display method"+super.a);
	}
}
public class Test {

	public static void main(String[] args) {
		
		B b= new B();
		b.i=10;
		//we can never assign private member of other class
		//but they can be accessed if we create public member function
		//b.j=20;
		b.display();
	}

}
