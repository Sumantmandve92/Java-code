package r_RecursionPattern;

public class Pattern27 {

	public static void main(String[] args) {
		
		int irange=9,jrange=5;
		char ch='A';
		loopI(0,irange,jrange,ch);
		

	}

	private static void loopI(int i, int irange, int jrange,char ch) {


		if(i<irange) 
		{
			loopJ(i,0,jrange,ch);
			System.out.println();
			if(i<4)
			{
			ch++;
			}
			else 
			{

				ch--;
			}
			i++;
			loopI(i, irange, jrange,ch);
		}
		
	}

	private static void loopJ(int i, int j, int jrange,char ch) {


		if(j<jrange) 
		{
			if(i>=j && i+j<=8) 
			{
				System.out.print(ch);
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
