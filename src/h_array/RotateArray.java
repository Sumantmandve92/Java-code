package h_array;

import java.util.Arrays;

//lecture 1: rotate array

public class RotateArray {

	public static void main(String[] args) {
		
		//rotate array left by one element................
		
		int a[]= {12,45,54,5,51,51,65};
		
		
		int temp=a[0];
		
		for(int i=0;i<a.length-1;i++) 
		{
			a[i]=a[i+1];
		}
		
		a[a.length-1]=temp;
		
		
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//rotate array right by one element................
		int[] b= {45,65,8,43,5,1,4,611,3,6,4,1,6,76,5};
		
		int temp1=b[b.length-1];
		for(int i=b.length-1;i>0;i--) 
		{
			b[i]=b[i-1];
		}
		a[0]=temp1;
		for(int i=0;i<b.length;i++) 
		{
			System.out.print(b[i]+" ");
		}
		System.out.println("\n"+Arrays.toString(b));
	}

}
