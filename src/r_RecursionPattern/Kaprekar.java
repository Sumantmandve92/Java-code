package r_RecursionPattern;

public class Kaprekar 
{

	public static void main(String[] args)
	{

		int num=2025;
		int cnt=0;
		int square=num*num;
		
		int temp=num;
		while(temp>0)
		{
			temp/=10;
			cnt++;
		}
		int div=(int)Math.pow(10,cnt);
		int left=square/div;
		int right=square%div;
		int sum=left+right;
		if(num==sum)
		{
			System.out.println("kaprekar number");
		}
		else
		{
			System.out.println("not");
		}
	}	
	
}	