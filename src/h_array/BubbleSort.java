package h_array;

//lecture 3: sorting method 2:Bubble sort

public class BubbleSort {

	public static void main(String[] args) {
		
		//int []a= {4,5,85,65,45,75,85,95,32,45,1,65,9,5,8,7,35,64,51,89};
		int []a= {7,6,9,1,2,5,4,3};
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a.length-i-1;j++) 
			{
				if(a[j]>a[j+1]) 
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}

	}

}
