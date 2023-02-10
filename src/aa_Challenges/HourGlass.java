package aa_Challenges;

import java.util.Scanner;

public class HourGlass {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int row=sc.nextInt();
	        int col=sc.nextInt();
	        int[][] a=new int[row][col];
	        for(int i=0;i<row;i++)
	        {
	            for(int j=0;j<col;j++)
	            {
	                a[i][j]=sc.nextInt();
	                
	            }
	        }
	        int maxsum=0;
	        for(int i=0;i<row-2;i++)
	        {
	            int sum=0;
	            for(int j=0;j<col-2;j++)
	            {
	                sum=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
	            System.out.println(sum);
	            if(sum>maxsum)
	            {maxsum=sum;}
	            }
	        }
	        System.out.println(maxsum);
	    }
	}
