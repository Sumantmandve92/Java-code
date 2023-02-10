package h_array;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	        int[][] a=new int[sc.nextInt()][];
	       
	        for(int i=0;i<a.length;i++)
	        {
	            a[i]=new int[sc.nextInt()];
	            for(int j=0;j<a[i].length;j++)
	            {
	                a[i][j]=sc.nextInt();
	            }
	        }
	        int b=sc.nextInt();
	        for(int i=0;i<b;i++)
	        {
	            
	            try
	            {
	                System.out.println(a[sc.nextInt()-1][sc.nextInt()-1]);
	            }
	            catch(Exception e)
	            {
	              System.out.println("ERROR!");  
	            }
	        }
	    }
	}
/*
 * 5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
 * 
 * */
 