package aa_Challenges;

public class Bellnumber {

	public static void main(String[] args) {
		int b=1;
	
		int n=15;
		int[][] bell=new int[n][n];
		bell[0][0]=1;
		//System.out.println(1);
		int temp=1;
		for (int i = 1; i < bell.length; i++) 
		{
			bell[i][0]=temp;
			for (int j = 1; j <=i; j++) 
			{
				bell[i][j]=bell[i-1][j-1]+bell[i][j-1];
				
			}
			System.out.println(temp);
			temp=bell[i][i];
			
		}
		
		
		
		
	}

}
