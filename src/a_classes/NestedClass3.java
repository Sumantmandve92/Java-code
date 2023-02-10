package a_classes;
//Abstract inner class

class State2
{
	abstract class District1
	{
		abstract void m1();
		 void show() 
		{
		
			System.out.println(" 'Private' show method from inner class");
		}
		 
	}
	class District2 extends District1
	{

		@Override
		void m1() {
			
			
		}
		
	}
	
	
}
public class NestedClass3 {

	public static void main(String[] args) {
		
		State2.District2 s2d=new State2().new District2();
	}

}
