package h_array;


//lecture 1: Reverse an array with or without using third variable

public class ReverseArray {

	public static void main(String[] args) {
		
		int [] a= {4,57,54,12,51,2,48,76};
		
		int i=0;
		int j=a.length-1;
		while(i<j) 
		{
			/*
			 * without using third variable
		a[i]=a[i]+a[j];//80
		a[j]=a[i]-a[j];//4
		a[i]=a[i]-a[j];//76
		*/
			
		//or with third variable
			
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		
			i++;
			j--;
		}
		for(int k=0;k<a.length;k++) 
		{
			System.out.print(a[k]+" ");
		}

	}

}
