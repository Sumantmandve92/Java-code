package r_RecursionPattern;

public class AddNaturalNo {

	public static void main(String[] args) {
		
		int n=1;
		int sum=add(n);
		System.out.println(sum);
	}

	private static  int add(int n) {
		
		
		if(n==10) 
		{
			return 0;
			
		}
			return n+add(n+1);
		
		
		
	}

}
