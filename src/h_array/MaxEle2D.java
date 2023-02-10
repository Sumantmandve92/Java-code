package h_array;

//maximum element in 2D array
public class MaxEle2D {

	public static void main(String[] args) {
		
		int[][] a= {{4,5,8},{8,9,6},{5,7,6}};
		int max=a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j]>max) 
				{
					max=a[i][j];
				}
			}
			
		}
		System.out.println(max);

	}

}
