package Basics;

import java.math.*;

public class BigFactorial {

	public static void main(String[] args) {
		
	
		
		BigInteger fact=new BigInteger("1");
		int num=100;
		
		while(num>0) 
		{
			String s1=String.valueOf(num--);
			BigInteger nextnum=new BigInteger(s1);
			BigInteger newfact=fact.multiply(nextnum);
			fact=newfact;
		}
		System.out.println(fact);
		
		//BigInteger methods
		BigInteger num1=new BigInteger("12");
		BigInteger num2=new BigInteger("13");
		//add()
		BigInteger result=num1.add(num2);
		//substract
		BigInteger result1=num1.subtract(num2);
		//multiply
		BigInteger result2=num1.multiply(num2);
		//divide
		BigInteger result3=num1.divide(num2);
		//reminder
		BigInteger result4=num1.remainder(num2);
		System.out.println(result4);
		//mod
		BigInteger result5=num1.mod(num2);
		

	}

}
