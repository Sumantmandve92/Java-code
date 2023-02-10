package i_String;

public class RemoveCharacters {

	public static void main(String[] args) {
		String s1="asdfjkljjghhgdhd";
		String s2="dhlg";
		//remove second string(each) characters from first string 
		for (int i = 0; i < s2.length(); i++)
		{
			String s3="";
			for (int j = 0; j < s1.length(); j++) 
			{
				if(s1.charAt(j)!=s2.charAt(i)) 
				{
					s3=s3+s1.charAt(j);
				}
			}
			s1=s3;
		}
		System.out.println(s1);
	}

}
