package h_array;

public class SumOfNonDiag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a= {
				{1,2,3,4},
				{4,5,6,7},
				{7,8,9,10},
				{5,8,9,6}};
		myCode(a);

	}
	static void myCode(int[][] a) 
	{
		int sum=0,cnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[0].length; j++) 
			{
				if(i!=j&&i+j!=(a.length-1)) 
				{
					sum+=a[i][j];
					cnt++;
					System.out.print(a[i][j]+" ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		double avg=sum/cnt;
		System.out.println("Sum of outer elements of matrix : "+sum+"\nAverage of outer elements of matrix "+avg);
	}

}
