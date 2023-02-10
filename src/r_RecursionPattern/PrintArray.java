package r_RecursionPattern;

public class PrintArray {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int i=0;
		printArray(a,i);

	}

	private static void printArray(int[] a, int i) {
		
		if(i<a.length) 
		{
		System.out.println(a[i]+" ");
		i++;
		printArray(a, i);
		}
		
	}

}
