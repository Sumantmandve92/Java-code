package r_RecursionPattern;

public class Pattern25 {

	public static void main(String[] args) {
		int irange=5,jrange=5;
		row(0,irange,jrange);

		}

		private static void row(int i, int irange, int jrange) 
		{
		if(i<irange) 
		{
			char ch='A';
			column(0,i,jrange,ch);
			System.out.println();
			i++;
			row(i, irange, jrange);
		}
			
		}

		private static void column(int j,int i, int jrange,char ch) 
		{
			if(j<jrange) 
			{
				if(j<=i) 
				{
					System.out.print(ch);
				}
				else {
					System.out.print(" ");
				}
				ch++;
				j++;
				column(j, i, jrange,ch);
			}
			
		}	
		
}
