package aa_Challenges;

import java.util.Scanner;

public class Capability {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your expectation : ");
		int expectation=sc.nextInt();
		if(expectation>Capability(sc)) 
		{
			System.out.println("great sadness will come in future");
		}
		else 
		{
			System.out.println("great happiness will come in future");
		}
		System.out.println("So we don't know what (sadness/happiness) will come in future.then decrease diffrence b/w expectation and capability.The better approch is that u should increase capability but don't decrease expectation ");

	}

	private static int Capability(Scanner sc) {


		int marks_in_test=sc.nextInt();
		
		return marks_in_test;
	}

}
