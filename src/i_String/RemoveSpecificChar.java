package i_String;

public class RemoveSpecificChar {

	public static void main(String[] args) {
		
		String s1="akjfhudlm";
		String s2="";
		char ch='d';
		for (int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i)!=ch) 
			{
				s2+=s1.charAt(i);
			}
		}
		System.out.println(s2);
		
		
		//by using char array
		String s3="";
		char[] chA=s1.toCharArray();
		for (int i = 0; i < chA.length; i++) 
		{
			if(chA[i]!=ch) 
			{
				s3+=chA[i];
			}
			
		}
		System.out.println(s3);

	}

}
