package aa_Challenges;

public class DeciToHexadecimal {

	public static void main(String[] args) {
		
		int n=894;
		char[] hex= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

		String s2="";
		while(n>0) 
		{
			int rem=n%16;
			s2=hex[rem]+s2;
			n/=16;
			
		}
		System.out.println(s2);
	}

}
