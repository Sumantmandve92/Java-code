package i_String;

public class Implement_toUpperCase {

	public static void main(String[] args) {
		
		
		String name="sumAnt";
		String s2="";
		
		for (int i = 0; i < name.length(); i++)
		{
			if(name.charAt(i)>='a' && name.charAt(i)<='z') 
			{
				s2=s2+(char)(name.charAt(i)-32);
			}
			else 
			{
				s2+=name.charAt(i);
			}
		}
		System.out.println(s2);
	}

}
