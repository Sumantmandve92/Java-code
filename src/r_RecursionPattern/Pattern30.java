package r_RecursionPattern;

public class Pattern30 {

	public static void main(String[] args) {
	
		int irange=12,jrange=6;
		char ch1='F';
		loopI(0,irange,jrange,ch1);

	}

	private static void loopI(int i, int irange, int jrange,char ch1) {
		
		if(i<irange) 
		{  char ch=ch1;
			loopJ(i,0,jrange,ch);
			System.out.println();
			if(i<5) 
			{
				ch1--;
			}
			else if(i>5) 
			{
				ch1++;
			}
			i++;
			loopI(i, irange, jrange,ch1);
		}
		
	}

	private static void loopJ(int i, int j, int jrange,char ch) {
		
		if(j<jrange) 
		{
			if(i+j<=5 || i-j>=6) 
			{
				System.out.print(ch--);
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
