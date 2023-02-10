package r_RecursionString;

public class Implemente_CompareTo {

	public static void main(String[] args) {
		
		
		String s1="java";
		String s2="java";
		boolean flag= loopI(0,s1,s2);
		if(flag) 
		{
			System.out.println(s1.length()-s2.length());
		}

	}

	private static boolean loopI(int i, String s1, String s2) {
		
		if(i<s1.length() && i<s2.length()) 
		{
			if(s1.charAt(i)!=s2.charAt(i)) 
			{
				System.out.println(s1.charAt(i)-s2.charAt(i));
				return false;
			}
			i++;
			return loopI(i, s1, s2);
		}
		return true;
	}

}
