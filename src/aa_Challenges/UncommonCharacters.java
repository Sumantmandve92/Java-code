package aa_Challenges;

import java.util.Vector;

public class UncommonCharacters {
	public static void main(String[] args) {

		String s1="abcdefgh";
		String s2="efghijkl";
		
	Vector<String> vector=new Vector<>();
	vector.add("A");
	vector.add("b");
	vector.add("c");
	vector.add("d");
	vector.insertElementAt("M", 0);
	System.out.println(vector);
	//		mycode(s1,s2);
				
	}
	private static void mycode(String s1, String s2) {
		String s3=s1+s2;
		String uncommonChar="";
		for(int i=0;i<s3.length();i++) 
		{
			int left=0,right=0;
			for(int j=0;j<s3.length();j++) 
			{
				if(s3.charAt(i)==s3.charAt(j) && j<i) 
				{
					left++;
				}
				else if(s3.charAt(i)==s3.charAt(j) && j>i) 
				{
					right++;
				}
			}
			if(right==0 && left==0) 
			{
				uncommonChar+=s3.charAt(i);
			}
		}
		System.out.println(uncommonChar);
//		if this answer is not matched then sort characters in 'uncommonchar'
		
		
	}
}
