package h_array;


//how to access 2D array elements
public class Array2D3 {

	public static void main(String[] args) {
		
		
		int[][] a= {
				   {1,2,1},
				   {2,3,4},
				   {4,5,8}
				   };
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
