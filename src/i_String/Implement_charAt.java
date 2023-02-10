package i_String;

public class Implement_charAt {

	public static void main(String[] args) {
		String name="welcome";
		
		int index=1;
		char[] ch=name.toCharArray();
		if(index>=ch.length)
		
		{
			System.out.println("index not present in the string");
			System.exit(0);
		}
		for (int i = 0; i < ch.length; i++) 
		{
			
			if(index==i) 
			{
				System.out.println(ch[i]);
			}
		}
		

	}

}
