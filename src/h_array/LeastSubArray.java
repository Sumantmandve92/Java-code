package h_array;

public class LeastSubArray {

	public static void main(String[] args) {

		
		int []a= {3,1255,5,68,94,55,45,545,55,5,55,45};
		int min=Integer.MAX_VALUE;
		int k=3;
		
		int minInd=0;
		for(int i=0;i<a.length-k+1;i++) 
		{int sum=0;
			for(int j=i;j<i+k;j++) 
			{
				sum+=a[j];
			}
			 int avg=sum/k;
			if(min>avg) 
			{
				min=avg;
				//sub array starting index
				minInd=i;
			}
			
			
		}
		System.out.println("minimum avg of sub array which starts at  index "+minInd+" is "+min);
	System.out.println("indexes of sub array elements are");
	for(int m=minInd;m<minInd+k;m++) 
	{
		System.out.print(m+" ");
	}
	}

}
