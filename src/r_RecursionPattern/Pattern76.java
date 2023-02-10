package r_RecursionPattern;
public class Pattern76 {
	public static void main(String[] args) {
		int irange=5,jrange=5,n=1;
		row(0,irange,jrange,n);
	}
	private static void row(int i, int irange, int jrange,int n) {
		if(i<irange) 
		{
			n=column(i,0,jrange,n);
			System.out.println();
			i++;
			row(i, irange, jrange,n);
		}
	}
	private static int column(int i, int j, int jrange,int n) {
		if(j<jrange) 
		{
			if(j<=i) 
			{
				System.out.print(n++ +" ");
			}
			else 
			{
				System.out.print("");
			}
			j++;
			return column(i, j, jrange, n);
		}
		return n;
	}
}
