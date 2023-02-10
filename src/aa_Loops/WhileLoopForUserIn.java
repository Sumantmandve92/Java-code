package aa_Loops;

import java.util.Scanner;

public class WhileLoopForUserIn {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		
		//how to break loop if user input is not given (scanner method sc.hasNext())
		while(sc.hasNext()) 
		{
			int a=sc.nextInt();
			
			System.out.println(a);
		}

	}

}
