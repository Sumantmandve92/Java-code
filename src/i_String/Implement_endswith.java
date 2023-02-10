package i_String;

public class Implement_endswith {

	public static void main(String[] args) {
		
		String s1="abcdefght";
		String s2="mm";
		//System.out.println(s1.endsWith(s2));
		boolean present=endswith(s1,s2);
		System.out.println(present);
	}

	private static boolean endswith(String s1, String s2) {
		boolean flag=true;
		if(s1.length()>=s2.length()) 
		{
			int i=s1.length()-1;
			int j=s2.length()-1;
			int cnt=0;
			for(int k=0;k<s2.length();k++)
			{
				if(s1.charAt(i)!=s2.charAt(j)) 
				{
					flag= false;
					break;
				}
				else 
				{
				cnt++;
				}
				i--;
				j--;
			}
			if(cnt==s2.length()) 
			{
				flag= true;
			}
		}
		else 
		{
			flag= false;
		}
		return flag;
	}

}
