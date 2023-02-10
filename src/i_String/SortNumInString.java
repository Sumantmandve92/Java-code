package i_String;

public class SortNumInString {

	public static void main(String[] args) {
	
		String s1="5497861359456";
		char[] ch=s1.toCharArray();
		
		//ascending
		for (int i = 0; i < ch.length; i++) 
		{
			for (int j = i+1; j < ch.length; j++) 
			{
				if(ch[i]>ch[j]) 
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
			
		}
		System.out.println(ch);
		
		//descending
		char[] ch1=s1.toCharArray();
		for (int i = 0; i < ch1.length; i++) 
		{
			for (int j = i+1; j < ch1.length; j++) 
			{
				if(ch1[i]<ch1[j]) 
				{
					char temp=ch1[i];
					ch1[i]=ch1[j];
					ch1[j]=temp;
				}
			}
			
		}
		System.out.println(ch1);
		

	}

}
