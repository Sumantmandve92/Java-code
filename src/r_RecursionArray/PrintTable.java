package r_RecursionArray;

public class PrintTable {

	public static void main(String[] args) {
		m1(10);

	}

	private static void m1(int i) {
		m2(--i);
		System.out.println(i*2);
	}

	private static void m2(int i) {
		m3(--i);
		System.out.println(i*2);
	}

	private static void m3(int i) {
		m4(--i);
		System.out.println(i*2);
	}
	private static void m4(int i) {
		m5(--i);
		System.out.println(i*2);
	}
	private static void m5(int i) {
		m6(--i);
		System.out.println(i*2);
	}
	private static void m6(int i) {
		m7(--i);
		System.out.println(i*2);
	}
	private static void m7(int i) {
		m8(--i);
		System.out.println(i*2);
	}
	private static void m8(int i) {
		m9(--i);
		System.out.println(i*2);
	}
	private static void m9(int i) {
		m10(--i);
		System.out.println(i*2);
	}

	private static void m10(int i) {
		System.out.println(i*2);
		
	}
}
