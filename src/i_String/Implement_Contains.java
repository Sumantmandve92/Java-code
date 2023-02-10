package i_String;

public class Implement_Contains {

	public static void main(String[] args) {
		String s1="aabcfrf";
		String s2="ab";
		boolean notFound=true;
		if(s1.length()>=s2.length()) 
		{
			for (int i = 0; i < s1.length(); i++) 
			{
				int cnt=0;
				for (int j = i; j < (i+s2.length()); j++)
				{
					if(s1.charAt(j)==s2.charAt(j-i)) 
					{
						cnt++;
					}
					else 
					{
						break;
					}
				}
				if(cnt==s2.length()) 
				{
					notFound=false;
					System.out.println(true);
					break;
				}
				
			}
		}
		if(notFound) 
		{
			System.out.println(false);
		}

	}

}
