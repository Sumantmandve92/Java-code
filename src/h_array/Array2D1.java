package h_array;

//Addition of two matrix:both matrix should be similar(m1:m*n,m2:m*n);
public class Array2D1 {

	public static void main(String[] args) {
		int[][] a= {{1,1,1},{2,2,2},{3,3,3}};
		int [][]b= {{1,1,1},{2,2,2},{3,3,3}};
		int[][] c= new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[0].length;j++) 
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
