package exception_Handling;

public class AE {

	
		void m1() 
		{
			m2();
		}
		void m2() {
			
			System.out.println("hello");
			int[] a= {2,6,45,5,4,5,5};
			
			//exception handling
			//_________________________________________
			try {
				System.out.println("hello1");
				System.out.println(5/0);
				System.out.println("hello2");
			} 
			catch (ArithmeticException e) {


				System.out.println("exception handled");
			}
			//_________________________________________
			System.out.println("exit");
		}
		public static void main(String[] args) {

		AE exe=new AE();
		exe.m1();
			

		}

	}
