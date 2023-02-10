package h_array;

//lecture 3:sorting method 3: Selection sort

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] a= {45,51,644,84,5,456,8,942,842,51,1,21};
		
		for(int i=0;i<a.length;i++) 
		{
			int min=i;
			//this j for loop is only for finding minimum element
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[min]>a[j]) 
				{
					min=j;
				}
			}
			//swap after finding minimum element
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}

	}

}
