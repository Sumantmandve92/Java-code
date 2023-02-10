package h_array;

public class Array1D17 {

	public static void main(String[] args) {
		
		
		int[] a= {4,5,12,36,8,42,6,74,13,66,41,23,66,54,11,23,36,54,11,23,36,65,11,2};
		int[] b=new int[a.length];
		int k=0;
		int j=b.length-1;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0) 
			{
				b[k]=a[i];
				k++;
			}
			else 
			{
				b[j]=a[i];
				j--;
			}
		}
		for (int i = 0; i < b.length; i++) 
		{
			System.out.print(b[i]+" ");
			
		}

	}

}
