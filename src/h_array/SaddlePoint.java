package h_array;

public class SaddlePoint {

	public static void main(String[] args) {
		
		
		int[][] a= {{1,8,6},
				    {0,9,6},
				    {0,5,9}
				    };
		int saddlePoint=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[0].length; j++) 
			{
				int min=a[i][j];
				int max=a[i][j];
				for (int k = 0; k < a[0].length; k++) 
				{
					if(min>a[i][k]) 
					{
						min=a[i][k];
					}
				}
				for (int k = 0; k < a.length && min==a[i][j]; k++) 
				{
					if(max<a[k][j]) 
					{
						max=a[k][j];
					}
				}
				if(min==max) 
				{
					saddlePoint++;
					System.out.println(a[i][j]);
				}	
			}
		}
		if(saddlePoint==0) 
		{
			System.out.println("no saddle point found");
		}

	}

}
