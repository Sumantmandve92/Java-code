package aa_Challenges;

import java.util.Scanner;

public class SpecialPattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num value :");
		int num=sc.nextInt();
		for (int i = num; i>0; i--) 
		{
			for (int j = num; j>0; j--) 
			{
				for (int k = 0; k <i ; k++) {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
		

	}

}
