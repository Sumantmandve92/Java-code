package i_String;
//indexof print only first char index
public class Implement_IndexOf {

	public static void main(String[] args) {
		
		
		String name="mandave";
		char ch1='a';
		char[] ch=name.toCharArray();
		int cnt=0;
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]==ch1) 
			{
				cnt++;
				System.out.println(i);
				break;
				
			}
		}
		if(cnt==0) 
		{
			System.out.println(-1);
		}
	}
}
