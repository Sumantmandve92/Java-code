package r_RecursionPattern;

public class Pattern1 {

	public static void main(String[] args) {
	  int irange=5,jrange=5;
		row(0,irange,jrange);

	}
	 //row method
	    static void row(int i, int irange, int jrange)
	    {
	        if(i<irange)
	        {
	           
	            column(i,0,jrange);
	            System.out.println();
	            i++;
	            row(i, irange, jrange);
	        }
	    }
	    //column method
	    static void column(int i, int j, int jrange)
	    {
	      if(j<jrange)
	      {
	              System.out.print("*");

	              j++;
	         column(i, j, jrange);
	      }
	      
	    }

}
