package i_String;


public class PalindromeString {

	public static void main(String[] args) {
	
		String string="abcdedcba";
		int i=0,j=string.length()-1;
		
		
		boolean flag=true;
		while(i<j) 
		{
			if(string.charAt(i)!=string.charAt(j)) 
			{
				flag=false;
				break;
			}
			i++;
			j--;
			
		}
		if(flag) 
		{
			System.out.println("palindrome");
		}
		else 
		{
			System.out.println("not palindrome");
		}

	}

}
