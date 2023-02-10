package h_array;
//lecture 1: Copying elements of array 'a' in array 'b'
public class Array1D5 {

	public static void main(String[] args) {
		
		int[] a= {5,68,9,5,6,1,5,5};
		int[] b=new int[a.length];
		
		System.out.println("Copying elements of array 'a' in array 'b' ..:");
		for(int i=0;i<a.length;i++) 
		{
			b[i]=a[i];
			System.out.print(b[i]+ " ");
		}

	}

}
