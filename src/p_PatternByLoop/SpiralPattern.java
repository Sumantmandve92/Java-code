package p_PatternByLoop;

import java.util.Arrays;

public class SpiralPattern {

	public static void main(String[] args) {
		
		int[][] a=new int[9][9];
		int imax=a.length-1;
		int imin=0;
		int jmax=a[0].length-1;
		int jmin=0;
		int cnt=10;
		for (int k = 0; k <5; k++) 
		{
			for(int i=jmin;i<=jmax;i++) 
			{
				a[imin][i]=cnt++;
			}
		
			for (int j = imin+1; j <=imax; j++) 
			{
				a[j][jmax]=cnt++;
				
			}
		
			for (int i = imax-1; i >=imin; i--) 
			{
				a[imax][i]=cnt++;
			}
			for (int i = imax-1; i >imin; i--) 
			{
				a[i][jmin]=cnt++;
			}
			imin++;imax--;jmin++;jmax--;
		}
		for(int[] i:a) 
		{
			for(int j:i) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
	}

	
	

}
