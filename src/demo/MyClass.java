package demo;

import java.awt.print.Printable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

//Encapsulation


public class MyClass {

	public static void main(String[] args) {

//	A a=new B();
//	a.print(3);
	Byte byte1=new Byte((byte)'A');
	Byte byte2=byte1.byteValue();
	System.out.println(byte1+" "+byte2);
	TreeSet<Integer> set=new TreeSet<>();
	set.add(1);
	set.add(2);
	set.add(3);
	System.out.println(set.pollLast());
	}

}
class A
{
	
	
 	void print(int i) 
	{
		System.out.println(i*i);
	}
 	public static void main(String[] args) {
		
	}
 	public static void main(String[] args,int i) {
		
	}
}
class B extends A
{

	public static void main(String[] args) {
		
	}
	
	 void print(int j) 
	{
		System.out.println(j+1);
	}
	 void print1(int j) 
		{
			System.out.println(j+1);
		}
}
class C extends B
{
	
	 void print(int i) 
	{
		System.out.println(i*2);
	}
}
