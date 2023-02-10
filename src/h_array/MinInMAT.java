package h_array;
//minimum element in array
public class MinInMAT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a= {{-1,2,3},{4,5,6},{7,8,9}};
		mycode(a);
	}
	static void mycode(int[][] a) 
	{
		int min=a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i][j]<min) 
				{
					min=a[i][j];
				}
			}
		}
		System.out.println("minimum element in matrix is : "+min);
	}

}
