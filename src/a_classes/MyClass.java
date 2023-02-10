package a_classes;

import java.util.Arrays;

public class MyClass 
{
	public static void main(String[] args) 
	{
		float x=15.0f;
		double y=65.4;
		System.out.println(Math.copySign(-x, -y));
		Float f1=new Float("140.0");
		int i=f1.intValue();
		byte b=f1.byteValue();
		double d=f1.doubleValue();
		System.out.println(i+b+d);
		String[] s1="ydd_gjh_hct_ytf        bh".split("_",2);
		
		System.out.println(Arrays.toString(s1));
	}	
}
