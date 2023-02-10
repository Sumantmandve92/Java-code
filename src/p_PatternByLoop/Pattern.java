package p_PatternByLoop;

public class Pattern {

	public static void main(String[] args) {
		int ch1=65;
		for (int i = 0; i < 6; i++) 
		{
			int diff=5;
			int ch=ch1;
			for (int j = 0; j <6; j++)
			{
				if(j<=i) 
				{
					System.out.print((char)ch);
					ch=(ch+diff);
				}
				else 
				{
					System.out.print(" ");
				}
			}
			ch1++;
			System.out.println();
		}
	}

}
