package b_methods;

public class CharMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		char array[] = {'x', 'b', '_', 'J', 'a', 'v', 'a', '_', 'e', 'x', 'a', 'm', 'p', 'l', 'e'};
        String str = String.copyValueOf(array);
        //System.out.print(str + ", ");
        String subStr = String.copyValueOf(array, 3, 4);
        //System.out.print(subStr + ", ");
         * 
         * copyValueOf(array,startIndex,No of elements to print from startIndex)
        subStr = String.copyValueOf(array, 3, 6);
        //System.out.println(subStr);
         * 
         * 
         * str.getChars(beginIndex, EndIndex, char[] array,destinationBegin)
         * 
         * 
        str.getChars(5, 12, array, 2);
        System.out.println();
        */
		String inputString = "reactwall";  //9
        char characters[] = inputString.toCharArray();
        System.out.print(meth(characters));
	}
	                                           // 0 1 2 3 4 5 6 7 8 
	 private static String meth(char[] input) {//(r,e,a,c,t,w,a,l,l)
	        int totalIndex = input.length;//9
	        int writeIndex = 1;//23234567
	        if (input[0] == 'b')
	        {   
	        	writeIndex = 0;    
	        }
	        for (int i = 1; i < totalIndex; ++i) //12345678
	        {
	            if (input[i] == 'b') 
	            {    
	            	continue;
	            }
	            if (input[i] == 'c') 
	            {
	                if (input[writeIndex - 1] == 'a')
	                {
	                    writeIndex--;
	                    continue;
	                }
	            }
	            input[writeIndex] = input[i];//r,e,t,w,a,l,l,l,l
	            writeIndex++;
	        }
	        return new String(input, 0, writeIndex);
	    }
	

}
