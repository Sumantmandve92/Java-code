package aa_Challenges;

import java.util.Arrays;

public class WaveArray {

	public static void main(String[] args) {
	
		
		
		int[] a= {1,2,2,3,3,4,5};
		
		for(int i=0;i<a.length-1;i++) 
		{
			if(a[i]<a[i+1]) 
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				
			}
			i++;
			
		}
		System.out.println(Arrays.toString(a));

	}

}
