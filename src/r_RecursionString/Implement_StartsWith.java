package r_RecursionString;
public class Implement_StartsWith {
	public static void main(String[] args) {
		String s1="ddjkffhdd";
		String s2="dd";
		if(s1.length()>=s2.length()) 
		{
			boolean flag=startsWith(0,s1,s2);
			if(flag) 
			{
				System.out.println(true);
			}
			else 
			{
				System.out.println(false);
			}
		}
		else 
		{
			System.out.println(false);
		}
	}
	private static boolean startsWith(int i, String s1, String s2) {
		if(i<s2.length()) 
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				return false;
			}
			i++;
			return startsWith(i, s1, s2);
		}
		return true;
	}
}
