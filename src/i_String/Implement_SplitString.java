package i_String;

public class Implement_SplitString {

	public static void main(String[] args) {
		
		String s1="You    are   very   very   good  students";
		String[] a=splitMethod(s1);
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+", ");
		}
	}
	private static String[] splitMethod(String s1) {
		//find size of array
		int space=0;
		for(int i=0;i<s1.length();i++) 
		{
			if(s1.charAt(i)==' ') 
			{
				space++;
			}
		}
		String[] a=new String[space+1];//array declared with size
		int index=0;
		//add strings in array
		String s2="";
		for(int i=0;i<s1.length();i++) 
		{
			if(s1.charAt(i)==' ') 
			{
				a[index++]=s2;
				s2="";
			}
			else 
			{
				s2=s2+s1.charAt(i);
			}
			if(i==s1.length()-1) 
			{
				a[index++]=s2;
			}
		}
		return a;
	}

}
