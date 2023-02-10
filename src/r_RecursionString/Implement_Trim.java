package r_RecursionString;

public class Implement_Trim {
	public static void main(String[] args) {
		String s1="    ab ghdddsrdyrtrs cg   ";
		Data ob=new Data(s1); 
	
		loopI(s1,ob);
		System.out.println(ob.i+" "+ob.j);
		String s2="";
		s2=print(s1,s2,ob);
		System.out.println(s2);
	}
	private static String print( String s1,String s2 ,Data ob) {
			if(ob.i<=ob.j) 
			{
				s2=s2+s1.charAt(ob.i);
				ob.i++;
				return print(s1, s2,ob);
			}
			return s2;
	}
	private static void loopI(String s1, Data ob) {
		if(true) 
		{
			if(s1.charAt(ob.i)==' ') 
			{
				ob.i++;
			}
			else if(s1.charAt(ob.j)==' ') 
			{
				ob.j--;
			}
			else 
			{
				return;	
			}
			loopI(s1, ob);
		}
	}
}
class Data
{
	int i;
	int j;
	public Data(String s1) 
	{
		j=s1.length()-1;
	}
}
