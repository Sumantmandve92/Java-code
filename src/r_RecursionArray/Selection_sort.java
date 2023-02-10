package r_RecursionArray;

import java.util.Arrays;

public class Selection_sort {

	public static void main(String[] args) {
	
		int[] a= {4,56,8,9,3,6,5,6,62,3,3,6,5,2};
		loopI(0,a);

		System.out.println(Arrays.toString(a));
	}

	private static void loopI(int i, int[] a) {
		
		if(i<a.length) 
		{
			//________________________________________________
			int min=i;
			 min=loopJ(i,i+1,min,a);
			 
			 int temp=a[min];
			 a[min]=a[i];
			 a[i]=temp;
			 //________________________________________________
			i++;
			loopI(i, a);
		}
		
	}

	private static int loopJ(int i, int j, int min, int[] a) {
		
		if(j<a.length) 
		{
			//_______________________________________________
			if(a[min]>a[j]) 
			{
				min=j;
			}
			//_______________________________________________
			j++;
			return loopJ(i, j, min, a);
		}
		return min;
	}

}
