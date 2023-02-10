package r_RecursionPattern;

public class Pattern19 {

	public static void main(String[] args) {
		int irange=9,jrange=9;
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
				if(i+j<4||i+j>12||j-i>4||i-j>4) 
				{
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				j++;
				column(j, i, jrange);
			}
			
		}	
		
}