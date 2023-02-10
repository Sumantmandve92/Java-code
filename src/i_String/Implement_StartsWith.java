package i_String;

public class Implement_StartsWith {

	public static void main(String[] args) {
		
		
		String s1="krushna";
		String s2="";
		
		if(s1.length()>=s2.length()) 
		{
				int j=0;
				int cnt=0;
				while(j<s2.length()) 
				{
					if(s1.charAt(j)==s2.charAt(j)) 
					{
						cnt++;
					}
					else 
					{
						break;
					}
					j++;
				}
				if(cnt==s2.length()) 
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
			System.out.println();
		}

	}

}
