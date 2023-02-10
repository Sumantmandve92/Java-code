package h_array;

//Transpose of matrix
public class Array2D {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[i].length;j++) 
			{
				if(j>i) 
				{
					int temp=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[i].length;j++) 
			{
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
