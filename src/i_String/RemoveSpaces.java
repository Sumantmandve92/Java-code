package i_String;

public class RemoveSpaces {

	public static void main(String[] args) {
		
		
		String s="     Welcome     to     Hefshine      ";
		
		int i=0,j=s.length()-1;
		while(true) 
		{
			if(s.charAt(i)==' ') 
			{
				i++;
			}
			else if(s.charAt(j)==' ')
			{
				j--;	
			}
			else 
			{
				break;
			}
		}
		String sNew="";
		for(int k=i;k<=j;k++) 
		{
			if(s.charAt(k)==' ' && s.charAt(k+1)==' ')
			{}
			else 
			{
				sNew=sNew+s.charAt(k);
			}
		}
		System.out.println(sNew);

	}

}
