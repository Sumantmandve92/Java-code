package aa_Challenges;

public class Char {

	public static void main(String[] args) {
		String inputString = "hi welcome";
        char characters[] = inputString.toCharArray();//h i _ w e l c o m e
        System.out.print(meth(characters));
	}
	
	 private static String meth(char[] input) 
	 {
		 int totalIndex = input.length;//10
	        int writeIndex = 1;//2345
	        if (input[0] == 'b') 
	        {    
	        	writeIndex = 0;
	        }
	        for (int i = 1; i < totalIndex; ++i) //2345
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
	            }                            //0 1 2 3 4
	            input[writeIndex] = input[i];//h i   w e
	            writeIndex++;   //2345             
	        }
	        return new String(input, 0, writeIndex);
	    }
}