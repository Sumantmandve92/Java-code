package h_array;
//multiplication of two matrices
public class Array2D2 {

	public static void main(String[] args) {
		int[][] a= {{1,1,1},{2,2,2},{1,1,1}};
		int[][] b= {{1,1,1,1},{3,3,3,3},{1,1,1,1}};
		int[][] c=new int[a.length][b[0].length];
		
		System.out.println("Multiplication of MAT(a) and MAT(b) is MAT(c) :") ;
		
		for(int i=0;i<a.length;i++) 
		{
			if(a[0].length!=b.length) 
			{
				System.out.println("Sorry....! \nMultiplicatin is not possible for these matrices.columns of first matrix and rows of second matrix should be same...!");
				break;
			}
			
			for(int j=0;j<b[0].length;j++) 
			{
				int sum=0;
				for(int k=0;k<a[0].length;k++) 
				{
					sum=sum+a[i][k]*b[k][j];
				}
				c[i][j]=sum;
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
