package r_RecursionPattern;

public class PrintEvenNo {

	public static void main(String[] args) {
	
		int i=0;
		print(i);

	}

	private static void print(int i) {
		if(i<=10) 
		{
			System.out.println(i);
			i+=2;
			print(i);
			
		}
		
	}

}
