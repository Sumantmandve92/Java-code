package h_array;
//average of outer 

public class AvgOfOuterEle {

	public static void main(String[] args) {
		
		
		int[][]a= {{1,2,3,4},{4,5,6,7},{7,8,9,10},{5,8,9,6}};
		myCode(a);

	}
	static void myCode(int[][] a) 
	{
		int sum=0,cnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[0].length; j++) 
			{
				if(i==0||j==0||j==(a[0].length-1)||i==(a.length-1)) 
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
