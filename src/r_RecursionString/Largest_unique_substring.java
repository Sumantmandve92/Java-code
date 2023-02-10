package r_RecursionString;

public class Largest_unique_substring {

	public static void main(String[] args) {
		
		String s1="aabcdeefd";
		String pre="";
		for(int i=0;i<s1.length();i++) 
		{
			String now="";
			for (int j = i; j < s1.length(); j++) 
			{
				boolean flag=true;
				for (int k = i; k <j; k++) 
				{
					if(s1.charAt(i)==s1.charAt(k)) 
					{
						flag=false;
						break;
					}
				}
				if(flag) 
				{
					now=now+s1.charAt(j);
				}
				else 
				{
					if(pre.length()<now.length()) 
					{
						pre=now;
						//break;
					}
					break;
				}
				
			}
		}
		System.out.println(pre);
		

	}

}
