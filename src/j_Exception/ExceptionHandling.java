package j_Exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			int num=10/0;
			System.out.println(num);
			
//		} catch (ArithmeticException e) 
//		{
//			System.out.println("infinite");
//		}
		}
		finally {
			System.out.println("num");
		}

	}

}
