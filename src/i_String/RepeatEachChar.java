package i_String;

public class RepeatEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="123654";
		
		int nonDigitCnt=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)<'0'||s.charAt(i)>'9') 
			{
				nonDigitCnt++;
			}
		}
		if(nonDigitCnt==0) 
		{
			System.out.println("only digits");
		}
		else 
		{
			System.out.println("not only digits");
		}
	}

}
