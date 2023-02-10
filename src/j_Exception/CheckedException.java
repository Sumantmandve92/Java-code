package j_Exception;

public class CheckedException {

	public static void main(String[] args) {

		System.out.println("in main");
		m1();
		System.out.println("out main");

	}

	private static void m1() {
		

		System.out.println("in m1");
		m2();
		System.out.println("out m1");

	}

	private static void m2() {

		System.out.println("in m2");
		try {
		      m3();
		      }
		catch(Exception exe){}
		System.out.println("out m2");
	}

	private static void m3() throws Exception{
		System.out.println("int main");
		Thread.sleep(10000);
		System.out.println("out main");

		
	}

}
