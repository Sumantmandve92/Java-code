package h_array;

import java.util.Arrays;

public class InsertionSort1 {

	public static void main(String[] args) {
		
		int[] b= {4,5,6,9};
	
		
		for(int i=0;i<b.length;i++) 
		{
			int j=i;
			for(;j>=0;j--) 
			{
				if(b[j]<b[i] ) 
				{
					break;
				}
			}
			//
			int temp=b[i];
			for(int k=i;k>j+1;k--) 
			{
				b[k]=b[k-1];
			}
			b[j+1]=temp;
			System.out.println(Arrays.toString(b));
		}
		
	}

}
