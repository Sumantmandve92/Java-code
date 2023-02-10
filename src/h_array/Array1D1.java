package h_array;

public class Array1D1 {

	public static void main(String[] args) {
	String x="198";
	int n=5;
	while(n>0) 
	{
		char[] ch=x.toCharArray();
		int i=ch.length-1;
		if(ch[i]%2!=0) 
		{
			ch[i]--;
		}
		System.out.print(ch);
		System.out.print(" ");
		n--;
	}

	}

}









