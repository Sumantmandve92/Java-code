package r_RecursionString;

public class Implement_IndexOfString {

	public static void main(String[] args) {
		
		String s1="ajdffdfldfdsfdfdkf";
		String s2="df";
		if(s1.length()>=s2.length()) 
		{
			int index=indexofString(0,s1,s2);
	 
			
				System.out.println(index);
			
		}
		else 
		{
			System.out.println(-1);
		}
	}
	private static int indexofString(int i, String s1, String s2) {
		if(i<s1.length()) 
		{
			int cnt=0;
			cnt=loopJ(i,i,s1,s2,cnt);
			if(cnt==s2.length()) 
			{
				return i;
			}
			i++;
			 return indexofString(i, s1, s2);
		}
		return -1;
	}
	private static int  loopJ(int i, int j, String s1, String s2,int cnt) {
		if(j<s2.length()+i) 
		{
			if(s1.charAt(j)==s2.charAt(j-i)) 
			{
				cnt++;
			}
			else 
			{
				return 0;
			}
			j++;
			return loopJ(i, j, s1, s2,cnt);
		}
		return cnt;
		
	}

}
