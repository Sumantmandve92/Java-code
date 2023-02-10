package aa_Challenges;

import java.util.Scanner;

/*Square pyramidal number (Sum of Squares)
A Square pyramidal number represents sum of squares of first natural numbers. First few Square pyramidal numbers are 1, 5, 14, 30, 55, 91, 140, 204, 285, 385, 506, …
Geometrically these numbers represent number of spheres to be stacked to form a pyramid with square base. Please see this Wiki image for more clarity.
Given a number s (1 <= s <= 1000000000). If s is sum of the squares of the first n natural numbers then print n, otherwise print -1.
Examples : 
 

Input : 14
Output : 3
Explanation : 1*1 + 2*2 + 3*3 = 14

Input : 26
Output : -
*/
public class Pyramidal_Numbers {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number to check is it  pyramidal or not : ");
		int  num=scanner.nextInt();
		
		int i=0,sum=0;
		while (sum<num)
		{
			i++;
			sum=sum+i*i;	
		}
		if(sum==num) 
		{
			System.out.println(i);
		}
		else 
		{
			System.out.println(-1);
		}

	}

}
