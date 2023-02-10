package aa_Challenges;

public class Cipher {

	public static void main(String[] args) {
		
		String s1="abcxyz";
		String newstring="";
		String s2=s1.toUpperCase();
		for(int i=0;i<s2.length();i++) 
		{
			newstring=newstring+(char)(155-s2.charAt(i));
		}
		System.out.println(newstring.toLowerCase());

	}

}
