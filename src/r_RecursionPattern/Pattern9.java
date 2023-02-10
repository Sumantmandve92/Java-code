package r_RecursionPattern;



public class Pattern9 {

	public static void main(String[] args) {
		
		int i=0;
		row(i);

	}

	private static void row(int i) {

		if(i<9) 
		{
		
			int j=0;
			
			column(i,j);
	
			i++;
			row(i);
		}
	}

	private static void column(int i, int j) {
		
		
		if(j<9) 
		{
			if((i+j<=8 && j-i>=0)||(i+j>=8 && j-i<=0)) 
			{
			System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
			j++;
		
			column(i, j);
		}
		
		
		
	}

}
