package i_String;

public class RemoveDupChar {

	public static void main(String[] args) {
		
		String s1="aaggdjsuhgdkkbdkj";
		String s2="";
		
		
		for (int i = 0; i < s1.length(); i++) 
		{
			int cnt=0;
			for (int j = 0; j <i; j++) 
			{
				if(s1.charAt(i)==s1.charAt(j)) 
				{
					cnt++;
				}
			}
			if(cnt==0) 
			{
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);

	}

}
