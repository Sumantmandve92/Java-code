package i_String;

public class EqualsMethod {

	public static void main(String[] args) {
		
		
		//with array as a object
		int[] a= {1,2};
		int[] b= {1,2};
		System.out.println(a==b);
		System.out.println(a.equals(b));
		a=b;
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		
		//with strings
		String s1="Hello";
		String s2="hello";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

	}

}
