package i_String;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//problem no 1....................................
		
		char array[] = {'x', 'b', '_', 'J', 'a', 'v', 'a', '_', 'e', 'x', 'a', 'm', 'p', 'l', 'e'};
        String str = String.copyValueOf(array);
        
        //print all string
        System.out.print(str + ", ");
        String subStr = String.copyValueOf(array, 3, 4);
        
        //print substring from index 3 to upto 4(but not 4)
        System.out.print(subStr + ", ");
        //print substring from index 3 to upto 6(but not 6)
        subStr = String.copyValueOf(array, 3, 6);
        System.out.println(subStr);
        str.getChars(0, 15, array, 0);
        
        //to print whole array as string
        System.out.println(Arrays.toString(array));
        
        //problem 2............................................................
		//conversion of numbers 
        String s1= new String("111");
        
        int d=Integer.parseInt(s1,10);
		System.out.print(d);
		
	}

}
