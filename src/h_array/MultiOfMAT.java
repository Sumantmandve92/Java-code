package h_array;

import java.util.Arrays;

public class MultiOfMAT {

	public static void main(String[] args) {

		int[]a[] = { { 1, 2, 3 }, { 5, 6, 8 } };
		int[][] b = { { 2, 3 }, { 5, 6 }, { 8, 9 } };

		int c[][] = new int[a.length][b[0].length];

		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < b[0].length; j++) 
			{
				for (int k = 0; k < b.length; k++) 
				{
					c[i][j] = c[i][j] + a[i][k] * b[k][j];

				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}