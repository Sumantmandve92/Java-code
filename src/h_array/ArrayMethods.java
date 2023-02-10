package h_array;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[6];
		
		//Syntax of Array.fill(array name,value you want to fill)
		
        Arrays.fill(array, 10);

        for (int i = 0, n = array.length; i < n; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //Array.fill(array name,starting index,upto this index(but not at this),value you want to fill)
        Arrays.fill(array, 3, 4, 50);
        for (int i = 0, n = array.length; i < n; i++)
        {
            System.out.print(array[i] + " ");
        }
	}

}
