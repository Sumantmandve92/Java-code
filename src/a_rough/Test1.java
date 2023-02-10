package a_rough;

import java.util.ArrayList;
import java.util.Collections;


public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=2;
		String s1="abcdef";
		char symbole='%';
		String s=str(s1,k,symbole);
		System.out.println(s);




	}
	static String str(String s1,int k,char symbole) {

		int []a=new int [s1.length()];
		int cnt=0;
		String s="";
		char ch='a';

		for(int i=0;i<s1.length();i++)
		{
			list.add(s1.charAt(i));
		}
		for(char i:list)
		{
			if(cnt%k==0)
			{

				list.add(ch);
			}
		}
		cnt++;


	

	Collections.reverse(list);
	for(char i:list)
	{
		s+=i;


	}

	return s;

}
}
