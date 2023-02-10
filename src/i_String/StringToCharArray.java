package i_String;



public class StringToCharArray {

	public static void main(String[] args) {
		
		
		String s="Hefshine";
		
		//(1) : .tocharArray().......................................
		
		
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) 
		{
			System.out.print(ch[i]);
		}
		System.out.println();
		
		
		//(2) : .charAt(int index).....................................
		
		
		for (int i = 0; i < s.length(); i++) {
			
			System.out.println(s.charAt(i)+" "+i);
			
		}
	}

}
