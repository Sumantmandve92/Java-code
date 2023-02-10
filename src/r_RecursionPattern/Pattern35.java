package r_RecursionPattern;

public class Pattern35 {

	public static void main(String[] args) {
		int irange=6,jrange=6;
		char ch='A';
		loopI(0,irange,jrange,ch);
		

	}

	private static void loopI(int i, int irange, int jrange,char ch) {


		if(i<irange) 
		{
		
			ch=loopJ(i,0,jrange,ch);
			System.out.println();
			
			i++;
			loopI(i, irange, jrange,ch);
		}
		
	}

	private static char loopJ(int i, int j, int jrange,char ch) {


		if(j<jrange) 
		{
			if(j<=i) 
			{
				System.out.print(ch++);
			}
			else 
			{
				System.out.print(" ");
			}
			j++;
			return loopJ(i, j, jrange, ch);
		}
		return ch;
		
	}

}
