package i_String;

public class longestUniqueCharSubString {
	public static void main(String[] args) {
		String s1="training";
		String max=""; 
	loopi:	for (int i = 0; i < s1.length(); i++) 
		{
			String s2="";
			for(int j=i;j<s1.length();j++) 
			{
				char ch=s1.charAt(j);

				boolean result=isChPresentIns1(s1,ch,i,j);
				if(result==false) 
				{
					s2=s2+s1.charAt(j);
					//System.out.println(s2);
				}
				else 
				{
					if(s2.length()>max.length()) 
					{
						max=s2;
					}
					break;
				}
				if(j==s1.length()-1) 
				{
					if(max.length()<s2.length()) 
					{
						max=s2;
						break loopi;
					}
				}
			}			
		}
		System.out.println(max);
	}
	private static boolean isChPresentIns1(String s1, char ch,int i,int j) {
		for (int k = i; k < j; k++) 
		{
			if(ch==s1.charAt(k)) 
			{
				return true;
			}
		}
		return false;
	}

}
