package r_RecursionArray;

public class MaxInMAT {

	public static void main(String[] args) {
		
		int[][] a= {{4,5,8},{8,9,6},{5,7,6}};
		int max=a[0][0];
		max=loopI(0,a,max);
		System.out.println(max);

	}

	private static int loopI(int i, int[][] a,int max) {
		
		if(i<a.length) 
		{
			max=loopJ(i,0,a,max);
			i++;
			return loopI(i, a,max);
		}
		return max;
	}

	private static int loopJ(int i, int j, int[][] a,int max) {
	
		if(j<a[i].length) 
		{
			if(max<a[i][j]) 
			{
				max=a[i][j];
			}
			j++;
			return loopJ(i, j, a, max);
		}
		return max;
		
	}

}
