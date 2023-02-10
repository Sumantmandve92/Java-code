package h_array;

import java.util.Arrays;

public class SwapKthElement {

	public static void main(String[] args) {
		
		int[] a= {5,1,7,8,3,5};
		int k=2;
		int temp=a[k-1];
		a[k-1]=a[a.length-k];
		a[a.length-k]=temp;
		System.out.println(Arrays.toString(a));

	}

}
