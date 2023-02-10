package c_constructors;

/*
 * It does not allow a class to be sub-classed.(no extend this class which has private constructor)
 *	
 *	If all the constant(final) methods are there in our class, we can use a private constructor.
 *	If all the methods are "static" then we can use a private constructor.
 *	We can use a public function to call the private constructor if an object is not initialized.
 *	We can return only the instance of that object if an object is already initialized.
 
*/


class Test
{
	void m1() 
	{
		//It  allow to create an object inside  the same class.
		Test test=new Test(10);
		System.out.println("A");
	}
	void m2() 
	{
		System.out.println("B");
	}
	//We cannot access a "private" constructor from any other class.
	//It does not allow to create an object outside the class.
	private Test(int a) 
	{
		
	}
	
}
//If a class has a private constructor and when we try to extend the class, a compile-time error occurs.
class Demo //extends Test
{
	Test test=new Test(10);
}


public class PrivateConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
