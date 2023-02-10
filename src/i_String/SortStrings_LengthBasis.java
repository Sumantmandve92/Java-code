package i_String;

public class SortStrings_LengthBasis {

	public static void main(String[] args) {
		
		
		String s1="Welcome to the world of java";
		
		
		//ascending
		String[] sa=s1.split(" ");
		for (int i = 0; i < sa.length; i++)
		{
			for (int j = i+1; j < sa.length; j++) 
			{
				if(sa[i].length()>sa[j].length()) 
				{
					String temp=sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
				
			}
		}
		for (int i = 0; i < sa.length; i++) 
		{
			System.out.println(sa[i]);
		}
		
		//descending
		System.out.println("\ndescending");
		String[] sa1=s1.split(" ");
		for (int i = 0; i < sa1.length; i++)
		{
			for (int j = i+1; j < sa1.length; j++) 
			{
				if(sa1[i].length()<sa1[j].length()) 
				{
					String temp=sa1[i];
					sa1[i]=sa1[j];
					sa1[j]=temp;
				}
				
			}
		}
		for (int i = 0; i < sa1.length; i++) 
		{
			System.out.println(sa1[i]);
		}
		
		//string which has minimum and maximum length
		
		System.out.println("smallest : "+sa[0]);
		System.out.println("largest : "+sa[sa.length-1]);

	}

}
