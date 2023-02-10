package h_array;


//Transpose of matrix
public class TransposeOfMat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		myCode(a);
	}
	static void myCode(int a[][])
	
	{
		int[][] b=new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				b[j][i]=a[i][j];
			}
			
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
			
		}
	}

}
