package aa_Challenges;

/*Smallest number 
The task is to find the smallest number with given sum of digits as S and number of digits as D.
Example 1:

Input:
S = 9 
D = 2
Output:
18
Explanation:
18 is the smallest number
possible with sum = 9
and total digits = 2.
*/
public class Smallest_N_Digit_integer {

	public static void main(String[] args) {
		int D=3;
		int S=9;
		int a=(int)Math.pow(10, D-1);
		int b=(int)Math.pow(10, D);
		for (int i = a; i <b ; i++) 
		{
			
			int sum=0;
			int temp=i;
			while(temp>0) 
			{
				sum=sum+temp%10;
				temp/=10;
			}
			if(sum==S) 
			{
				int num=i;
				int rem=9;
				int cnt=0;
				while(num>0) 
				{
					if(num%10<=rem) 
					{
						cnt++;
						rem=num%10;
					}
					num/=10;
				}
				if(cnt==D) 
				{
					System.out.println(i);
				}
			}
		}
	}

}
