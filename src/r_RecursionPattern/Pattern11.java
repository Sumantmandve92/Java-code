package r_RecursionPattern;

public class Pattern11 {

	public static void main(String[] args) {
		int irange=5,jrange=5;
		row(0,irange,jrange);

		}

		private static void row(int i, int irange, int jrange) 
		{
		if(i<irange) 
		{
			column(0,i,jrange);
			System.out.println();
			i++;
			row(i, irange, jrange);
		}
			
		}

		private static void column(int j,int i, int jrange) 
		{
			if(j<jrange) 
			{
				if(i<=j) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
				j++;
				column(j, i, jrange);
			}
			
		}	
		
}