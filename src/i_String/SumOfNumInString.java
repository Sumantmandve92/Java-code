package i_String;

public class SumOfNumInString {

	public static void main(String[] args) {
		
		
		String s="1564879p";
		
		int sum=0;
		for(int i=0;i<s.length();i++) 
		{
			char ch=s.charAt(i);
			if(ch>='0'&& ch<='9') 
			{
				sum=sum+(ch-48);
				//or sum=sum+Integer.parseInt(""+ch);
			}
		}
		System.out.println(sum);
		
		
		

	}

}
