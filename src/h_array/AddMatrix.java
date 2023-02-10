package h_array;


//Addition of two matrices
public class AddMatrix {

	public static void main(String[] args) {
		
		
		int[][] a= {{1,2,3},{5,6,9},{8,9,5}};
		int[][] b= {{5,2,2},{51,6,19},{6,0,5}};
		int[][] c= new int[3][3];
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
