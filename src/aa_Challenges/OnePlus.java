package aa_Challenges;


/*Plus One 
Easy Accuracy: 50.09% Submissions: 38524 Points: 2
Given a non-negative number represented as a list of digits, add 1 to the number (increment the number represented by the digits). The digits are stored such that the most significant digit is first element of array.
 

Example 1:

Input: 
N = 3
arr[] = {1, 2, 4}
Output: 
1 2 5
Explanation:
124+1 = 125, and so the Output
Example 2:

Input: 
N = 3
arr[] = {9,9,9}
Output: 
1 0 0 0
Explanation:
999+1 = 1000, and so the output
*/
public class OnePlus {

	public static void main(String[] args) {


		int[] arr= {9,9,9,9};
		int i=0,sum=0;
		
		while(i<arr.length) 
		{
			sum=sum*10+arr[i];
			i++;
		}
		//add one
		int newSum=sum+1;
		int temp=newSum;
		//check no of digits in newSum
		int cntDigit=0;
		while(temp>0) 
		{
			cntDigit++;
			temp/=10;
		}
		//declare array 
		int[] b=new int[cntDigit];
		int index=0;
		//put values in that array
		for (int j = b.length-1; j >=0; j--) 
		{
			b[j]=newSum%10;
			newSum/=10;
		}
		for (int j = 0; j < b.length; j++) {
			System.out.print(b[j]+" ");
		}
	}

}
