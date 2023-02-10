package h_array;

//minimum element in each column

public class MinINEachCol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a= {
				{4,6,3,4},
				{4,5,6,7},
				{7,8,9,10},
				{5,8,9,6}};
		for (int i = 0; i < 1; i++) 
		{
		
			for (int j = 0; j < a[i].length; j++)
			{
				int min=a[i][j];
				for (int k = 0; k < a.length; k++) 
				{
					if(min>a[k][j]) 
					{
						min=a[k][j];
					}
				}
				System.out.println(min+" is minimum in "+j+" th col.");
				
			}
		}
	}

}
