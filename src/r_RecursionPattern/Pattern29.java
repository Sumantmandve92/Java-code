package r_RecursionPattern;

public class Pattern29 {

	public static void main(String[] args) {
		int irange=10,jrange=5;
		
		loopI(0,irange,jrange);
		

	}

	private static void loopI(int i, int irange, int jrange) {


		if(i<irange) 
		{
			char ch='A';
			loopJ(i,0,jrange,ch);
			System.out.println();
			
			i++;
			loopI(i, irange, jrange);
		}
		
	}

	private static void loopJ(int i, int j, int jrange,char ch) {


		if(j<jrange) 
		{
			if(i-j>=5 || i+j<=4) 
			{
				System.out.print(ch++);
			}
			else 
			{
				System.out.print(" ");
			}
			j++;
			loopJ(i, j, jrange, ch);
		}
		
	}

}
