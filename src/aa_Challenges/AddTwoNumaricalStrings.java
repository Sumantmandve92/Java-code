package aa_Challenges;

import java.util.Arrays;

//string has number may be out of the range of long data type
public class AddTwoNumaricalStrings {

	public static void main(String[] args) {
		String m="4555444587795649765695684664";
		String n="6454487576896792499497966545";
		int a=m.length()>=n.length() ? m.length():n.length();
		int[] mn=new int [a+1];//
		int mi=m.length()-1;
		int  ni=n.length()-1;
		int quo=0;
		for(int i=a;i>=0;i--) 
		{
			if(mi>=0  && ni>=0){
			int sum=m.charAt(mi--)+n.charAt(ni--)-96+quo;
			mn[i]=sum%10;
			quo=sum/10;
			}
			else if(mi>=0) {
				int sum=m.charAt(mi--)-48+quo;
				mn[i]=sum%10;
				quo=sum/10;
			}
			else if(ni>=0) {
				int sum=n.charAt(ni--)-48+quo;
				mn[i]=sum%10;
				quo=sum/10;
			}
			else {
				mn[i]=quo;
			}
		}
		String s2="";
		for (int i = 0; i < mn.length; i++) {
			if(mn[0]!=0) 
			{
				s2=s2+mn[i];
			}
		}
		//System.out.println(Arrays.toString(mn));
		System.out.println(m+" + "+n+" = "+s2);

	}

}
