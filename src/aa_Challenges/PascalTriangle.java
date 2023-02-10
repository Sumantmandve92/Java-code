package aa_Challenges;

public class PascalTriangle {

	public static void main(String[] args) {

		int[][] a=new int[10][10];
		a[0][0]=1;
		int sum=1;
		//System.out.println(a[0][0]);

		for(int i=1;i<10;i++) 
		{
			for (int j = 0; j < a.length-i; j++) {
				System.out.print(" ");
			}
			if(i==1) {System.out.println(a[0][0]);}
			int val=0;
			for(int j=0;j<=i;j++) 
			{
				a[i][j]=val+a[i-1][j];
				System.out.print(a[i][j]+" ");
				sum=sum+a[i][j];
				val=a[i-1][j];
			}

			System.out.println();

		}
//		System.out.println(sum);
//		a[4][4]=1;
//		for(int i=1;i<a.length;i++) 
//		{
//			int val=1;
//			for (int j = 0; j < a.length; j++) 
//			{
//				a[i][j]= val+a[i-1][j];
//				System.out.print(a[i][j]+" ");
//				val=a[i-1][j];
//			}
//			System.out.println();
//		}
		
	}

}
