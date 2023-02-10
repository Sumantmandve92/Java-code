package r_RecursionString;

public class Implement_endsWith {

	public static void main(String[] args) {
		
		
		String s1="abcdkfjfdj";
		String s2="ffdj";
		int i=s1.length()-1;
		int j=s2.length()-1;
		if(i>=j)
		{
			boolean flag=endsWith(i,j,s1,s2);
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

	private static boolean endsWith(int i,int j,String s1, String s2) {
		
		if(i>=0  && j>=0) 
		{
			if(s1.charAt(i)!=s2.charAt(j)) 
			{
				return false;
			}
			i--;
			j--;
			return endsWith(i, j, s1, s2);
		}
		return true;
		
	}

}
