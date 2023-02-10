package Permatma;

public class DADA {

	public static void main(String[] args) {
		int irange=8;
		int jrange=4;
		for(int i=1;i<=irange;i++) 
		{
			for(int j=1;j<=jrange;j++) 
			{
				if((i+j>=6) && (j-i>=(-4))) 
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
