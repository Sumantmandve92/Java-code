package i_String;

public class implement_IndexofString {

	public static void main(String[] args) {
		String s1="aabcfrabf";
		String s2="ab";
		boolean notFound=true;
		if(s1.length()>=s2.length()) 
		{
			int lastFoundAt=0;
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
					//System.out.println(true);
				lastFoundAt=i;
					break;
				}
			}
			if(notFound==false) 
			{
				System.out.println(lastFoundAt);
			}
			
		}
		if(notFound) 
		{
			//System.out.println(false);
			System.out.println(-1);
		}

	}

}