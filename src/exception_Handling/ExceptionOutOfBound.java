package exception_Handling;
public class ExceptionOutOfBound {

	
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
			System.out.println(a[8]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {


			System.out.println("exception handled");
		}
		//_________________________________________
		System.out.println("exit");
	}
	public static void main(String[] args) {

	ExceptionOutOfBound exe=new ExceptionOutOfBound();
	exe.m1();
		

	}

}
