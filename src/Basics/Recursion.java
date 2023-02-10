package Basics;

public class Recursion {


	 public static void main(String[] args) {
	       //boolean s=false&true|true&true|true|false;
	        int out =9;
	        for(int i=4;i<6;i++)
	        {
	            for(int j=7;j>=5;j--)
	            {
	                if(i==j)
	                    continue;
	                if(i>j)
	                {
	                    out+=main(i,j);
	                }
	                else
	                {
	                    out+=main(j,i);
	                }
	            }
	        }
	        System.out.println("out = "+out);


	    }
	    private static int main(int a,int b)
	    {
	       if(a+b==0)
	       {
	           return 2;
	       }
	       return a+main(a-1,b);
	    }

}
