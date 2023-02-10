package r_RecursionArray;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
	
		int[] a= {5,6,9,4,3,1,5,7,8};
		loopI(0,a);
		System.out.println(Arrays.toString(a));
	}
	private static void loopI(int i, int[] a) {
		
		if(i<a.length) 
		{
			//---------------------------------------
			int j=loopJ(i,i,a);
			//swap code form j+1 to i
			int temp=a[i];
			swap(i,j,a);
			a[j+1]=temp;
			//-----------------------------------------
			i++;
			loopI(i, a);
		}	
	}
	private static void swap(int k, int j, int[] a) {
		if(k>j+1) 
		{
			//---------------------------------------
			a[k]=a[k-1];
			//----------------------------------------
			k--;
			swap(k, j, a);
		}
	}
	private static int loopJ(int i, int j, int[] a) {
		if(j>=0) 
		{
			//-------------------------------------
			if(a[i]>a[j]) 
			{
				return j;
			}
			//-------------------------------------
			j--;
			return loopJ(i, j, a);
		}
		return j;
	}
}
