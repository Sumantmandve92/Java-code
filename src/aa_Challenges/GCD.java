package aa_Challenges;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		int a=scanner.nextInt();
//		int b=scanner.nextInt();
//		int gcd=getGCD( a, b);
//		System.out.println(gcd);
//		int lcm=getLCM(a,b);
		System.out.println((int)(char)(byte)(0xff));
		
	}
	private static int getLCM(int a, int b) {
		int maxnum=Math.max(a, b);
		for(int i=maxnum;true;i++) 
		{
			if(i%a==0 && i%b==0) 
			{
				return i;
			}
		}
		
	}
	private static  int getGCD(int a,int b) 
	{
		int minnum=Math.min(a,b);
		for(int i=minnum;i>0;i--) 
		{
			if(a%i==0 && b%i==0) 
			{
				return i;
				
			}
			
		}
		return 1;
	}

}
