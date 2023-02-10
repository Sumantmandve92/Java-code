package i_String;

import java.math.BigInteger;

public class Add_numbers_in_string {

	public static void main(String[] args) {

		String s1="fd 5df45 sdf111dd59sds16d";
		int powerOf10=0;
		int sum=0;
		for (int i = s1.length()-1; i >=0; i--) 
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
				int power=(int)Math.pow(10, powerOf10);
				sum=sum+(s1.charAt(i)-48)*power;
				powerOf10++;
			}
			else 
			{
				powerOf10=0;
			}
		}
		System.out.println(sum);

	}

}
