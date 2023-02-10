package i_String;


//print duplicate elements at once
public class PrintDupCharInString {

	public static void main(String[] args) {
		
		
		String s1="sjhjskj";
		for (int i = 0; i < s1.length(); i++) 
		{
			int left=0,right=0;
			for (int j = 0; j <s1.length(); j++) 
			{
				if(s1.charAt(i)==s1.charAt(j) && j<i) 
				{
					left++;
				}
				else if(s1.charAt(i)==s1.charAt(j)&& j>i) 
				{
					right++;
				}
			}
			if(left==0 && right!=0) 
			{
				System.out.println(s1.charAt(i));
			}
			
		}

	}

}
