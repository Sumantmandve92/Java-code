package h_array;

//lecture 3:sorting method 1 :insertion sort

public class BasicSort {

	public static void main(String[] args) {
	
		int []a= {4,5,85,65,45,75,85,95,32,45,1,65,9,5,8,7,35,64,51,89};
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]>a[j]) 
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}

	}

}
