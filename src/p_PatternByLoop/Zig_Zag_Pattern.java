package p_PatternByLoop;

public class Zig_Zag_Pattern {

	public static void main(String[] args) {


		int[][] a=new int[5][5];
		int cnt=1;
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 5; j++) {
				
				if(i>=j) 
				{
					a[i][j]=cnt++;
				}
				else 
				{
					a[i][j]=0;
				}
			}
			i++;
			for (int j = 4; j >=0  && i<5; j--)
			{
				if(j<=i) 
				{
					a[i][j]=cnt++;
				}
				else 
				{
					a[i][j]=0;
				}
			}
		}
		for(int[] i:a) 
		{
			for(int j:i) 
			{
				if(j!=0)
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
