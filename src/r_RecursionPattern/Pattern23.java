package r_RecursionPattern;

public class Pattern23 {

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
				if((j<i &&i+j<8)||j-i>4||i+j>12) 
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