package i_String;

import java.util.Arrays;

public class Implement_SplitMethod {

	public static void main(String[] args) {


		String s1="hgsdhjg hjhjsgd hjgdsg uytdyud yuty";
		int cnt=0;
		for (int i = 0; i < s1.length(); i++)
		{
			
			if(s1.charAt(i)==' ') 
			{
				cnt++;
			}
		}
		String[] sa=new String[cnt+1];
		int index=0;
		sa[0]="";
		for (int i = 0; i <s1.length(); i++) 
		{
			
			if(i==0||s1.charAt(i)==' ') 
			{
				sa[index+1]="";
			}
			if(s1.charAt(i)!=' ') 
			{
				sa[index]=sa[index]+ s1.charAt(i);
			}
			else 
			{
				index++;
			}
		}
		System.out.println(Arrays.toString(sa));
		for (String string : sa) {
			System.out.println(string);
		}
	}

}
