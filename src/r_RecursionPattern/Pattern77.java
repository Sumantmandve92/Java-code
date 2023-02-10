package r_RecursionPattern;

public class Pattern77 {

	public static void main(String[] args) {
		int a=1,irange=5,jrange=5;
		loopI(0,a,irange,jrange);

	}

	private static void loopI(int i, int a, int irange, int jrange) {
		
		if(i<irange) 
		{
			loopJ(i,a,0,jrange, 4);
			a++;
			System.out.println();
		
			i++;
			loopI(i, a, irange, jrange);
		}
	}

	private static void loopJ(int i, int a, int j, int jrange,int diff) {
		if(j<jrange) 
		{
			if(j-i<=0) 
			{
				System.out.print(a+" ");
				a=a+diff--;
			}
			else 
			{
				System.out.print(" ");
			}
			j++;
			loopJ(i, a, j, jrange,diff);
		}
	}

}
