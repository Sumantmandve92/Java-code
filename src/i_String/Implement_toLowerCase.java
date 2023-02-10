package i_String;

public class Implement_toLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="SUMANT";
		String s2="";
		
		for (int i = 0; i < name.length(); i++)
		{
			if(name.charAt(i)>='A' && name.charAt(i)<='Z') 
			{
				s2=s2+(char)(name.charAt(i)+32);
			}
			else 
			{
				s2+=name.charAt(i);
			}
		}
		System.out.println(s2);
	}

}