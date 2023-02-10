package h_array;

//lecture 1:avg of array elements

public class Array1D3 {

	public static void main(String[] args) {
		
		int[] a= {1,2,4,3,5,6};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) 
		{
			sum +=a[i];
		}
		System.out.println(sum);
		
		//1.0 is to convert int into double
		double avg= (sum*1.0)/a.length;
		
		System.out.println(avg);

	}

}
