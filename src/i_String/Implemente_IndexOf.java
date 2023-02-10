package i_String;

public class Implemente_IndexOf {

	public static void main(String[] args) {
		String s1="abcd";
		String s2="f";
		boolean flag=true;
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
					flag=false;
					System.out.println(i);
					break;
				}
			}
		}
		if(flag) 
		{
			System.out.println(-1);
		}
		

	}

}
