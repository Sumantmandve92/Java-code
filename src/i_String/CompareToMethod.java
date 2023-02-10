package i_String;

public class CompareToMethod {

	public static void main(String[] args) {
		
		
		String s1="Krushna";
		String s2="Krishna";
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1==s2);
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		

	}

}
