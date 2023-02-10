package aa_Loops;

public class ForEach {

	public static void main(String[] args) {
		
		
		//for each loop is used only for array only
		int[] a= {5,4,8,9,7,6,1,12,13};
		
		for (int i : a) 
		{
			System.out.print(i+" ");
		}
		
		
		// for loop is with indexes of elements
		System.out.println();
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
			
		}

	}

}
