package a_classes;
//constructor in inner class
class State1
{
	class District
	{
		 void show() 
		{
		
			System.out.println(" 'Private' show method from inner class");
		}
		 
		  District(int a)
		 {
			System.out.println("Constructor of inner class");
			System.out.println(a);
		}
	}
	void  State1(int b)
	 {
		 System.out.println("Constructor of outer class");
		System.out.println(b);
	}
	
}
public class NestedClass2 {

	public static void main(String[] args) {
	State1 state1=new State1();
	state1.State1(5);
	state1.show();
		State1.District sd1=new State1().new District(20);
		sd1.show();
		sd1.State1(10);
	}

}
