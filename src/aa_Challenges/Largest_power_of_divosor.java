package aa_Challenges;
/*
 * Find maximum power of a number that divides a factorial
Given two numbers, fact and n, find the largest power of n that divides fact! (Factorial of fact).

Examples: 

Input : 
fact = 5, n = 2
Output : 
3
Explanation:
Value of 5! is 120. The largest power
of 2 that divides 120 is 8 (or 23

Input : 
fact = 146, n = 15
Output : 
35
 * 
 * 
 * */
public class Largest_power_of_divosor {

	public static void main(String[] args) {
		int num=146;
		int base=5;
		int power=0;
		while(num>0) 
		{
			int temp=num;
			while(temp>0) 
			{
				if(temp%base==0) 
				{
                    power++;
                    temp/=base;
				}
				else 
				{
					break;
				}
				
			}
			num--;
		}
		System.out.println(power);

	}

}
