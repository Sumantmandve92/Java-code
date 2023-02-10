package h_array;

//lecture 1: maximum  and minimum element in array

public class Array1D6 {

	public static void main(String[] args) {
		
		int a[]= {45,85,65,74,31,94,222,1};
		//maximum element
		int max=0;// or int max=a[0];		
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]>max) 
			{
				max=a[i];
			}
		}
		System.out.println("maximum element in given array is :"+max);
		//minimum element
		
		int min=a[0];
		//we can take any value from the array to compare 
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]<min) 
			{
				min=a[i];
			}
		}
		System.out.println("minimum element in given array is :"+min);

	}

}
