package i_String;

public class Max_Min_lengthStringArray {

	public static void main(String[] args) {
		String[] sa= {"welcome","to","the","world","of","java"};
		
		String maxString=sa[0];
		int max=maxString.length();
		
		String minString=sa[0];
		int min=minString.length();
		
		for (int i = 0; i < sa.length; i++)
		{
			if(sa[i].length()>max) 
			{
				maxString=sa[i];
				max=sa[i].length();
			}
			if(sa[i].length()<min) 
			{
				minString=sa[i];
				min=sa[i].length();
			}
			
		}
		System.out.println("string which has maximum length : "+maxString);
		System.out.println("string which has minimum length : "+minString);
		

	}

}
