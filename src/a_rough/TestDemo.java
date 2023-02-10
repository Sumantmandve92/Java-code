package a_rough;

import java.util.Iterator;

public class TestDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=2;
		
		
		String s1="abcdef";
		char symbole='%';
		String s=str1(s1,k,symbole);
		System.out.println(s);


}

	private static String str1(String s1, int k, char symbole) {
	
		String s2="";
		
		int cnt=0;
		for(int i=s1.length()-1;i>=0;i--) 
		{
			if(cnt%k!=0 || cnt==0) 
			{
				s2=s1.charAt(i)+s2;
				cnt++;
			}
			else 
			{
				s2=s1.charAt(i)+""+symbole+s2;
				cnt++;
			}
		}
		
		
		return s2;
	}

	private static String str(String s1, int k,int k1, char symbole) {
		StringBuffer sf=new StringBuffer(s1);
		sf.reverse();
		String s2="";
		String s3="";
		int c=0;
		int i=c;
		
		
		while(i<=sf.length()-k1)
		{
		for(i=c;i<k;i++)
		{
			s2=s2+sf.charAt(i);
			
			
		}
		if(i<sf.length())
		{
		s3=s3+s2+symbole;
		}
		else {
			s3=s3+s2;
		}
		s2="";
		c=c+k1;
		k=i+k1;
		}
		
		return s3;
	}
}
