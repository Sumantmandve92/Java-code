package i_String;

public class ReplaceMethod {

	public static void main(String[] args) {
		
		String name= new String("adfsjgddddhgd");
	
		String re="";
		for (int i = 0; i < name.length(); i++)
		{
			if(name.charAt(i)=='d') 
			{
				re=re+'f';
			}
			else 
			{
				re=re+name.charAt(i);
			}
		}
		System.out.println(re);
		String s="Krush     naa";
		s=s.replace(" ", "");
		System.out.println(s);

	}

}
