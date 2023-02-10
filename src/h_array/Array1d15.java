package h_array;
//lecture 3:Difference between max and min element in array 
public class Array1d15 {

	public static void main(String[] args) {
		
		int[] a= {4,5,8,7,9,41,57,61,35,85,94,46,51,24};
		int min=a[0],max=a[0];
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				if(a[i]>max) 
				{
					max=a[i];
				}
				if(a[i]<min) 
				{
					min=a[i];
				}
			}
		}
		
		System.out.println("Difference between max and min element in array is :"+(max-min));

	}

}
