package h_array;

//average of inner elements
public class SumOfInnerEle2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] a= {{5,9,7,6},{8,4,5,9},{5,8,4,3},{9,4,2,6}};
		
		int sum=0,cnt=0;
		for (int i = 1; i < a.length-1; i++) 
		{
			for (int j = 1; j < a[i].length-1; j++) 
			{
				sum+=a[i][j];
						cnt++;
				
			}
			
		}
		System.out.println("sum of inner elements : "+sum);
		
		int avg=sum/cnt;
		System.out.println("average of inner element :"+avg);
		
		
	}

}
