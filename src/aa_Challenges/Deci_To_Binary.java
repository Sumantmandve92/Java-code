package aa_Challenges;

public class Deci_To_Binary {

	public static void main(String[] args) {
		
		int n=6;
		String s2="";
		while(n>0) 
		{
			s2=n%2+s2;
			n/=2;
		}

		int deci=Integer.parseInt(s2);
		System.out.println(deci);
	}

}
