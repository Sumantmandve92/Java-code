package r_RecursionString;

public class IMplement_split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="You    are   very   very   good  students";
		String[] a=splitMethod(s1);
		print(0,a);
			
	}
	private static void print(int i, String[] a) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			System.out.print(a[i]+", ");
			i++;
			print(i, a);
		}
	}
	private static String[] splitMethod(String s1) {
		//find size of array
		int space=0;
		space=space(s1,0,space);
		String[] a=new String[space+1];//array declared with size
		int index=0;
		//add strings in array
		String s2="";
		Add(0,s1,s2,a,index);
		return a;
	}
	private static void Add(int i, String s1, String s2, String[] a, int index) {
		// TODO Auto-generated method stub
		if(i<s1.length())
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
			i++;
			Add(i, s1, s2, a, index);
		}


	}
	private static int space(String s1,int i, int space) {

		if(i<s1.length()) {
			if(s1.charAt(i)==' ') 
			{
				space++;
			}
			i++;
			return space(s1,i,space);
		}
		return space;
	}


}
