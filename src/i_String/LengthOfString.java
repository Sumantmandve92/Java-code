package i_String;
//contains of string
public class LengthOfString {

	  public static void main(String[] args) {
	        String a = "Anandnankumar";
	        char[] ch1 = a.toCharArray();
	        String b = "anu";
	        char[] ch2 = b.toCharArray();
	        int cnt = 0;

	        for(int i = 0; i < a.length(); ++i) 
	        {
	            if (ch1[i] == ch2[cnt]) 
	            {
	                ++cnt;
	            } 
	            else 
	            {
	                cnt = 0;
	            }

	            if (cnt == b.length()) 
	            
	            {
	                break;
	            }
	        }

	        if (cnt == b.length()) {
	            System.out.println("yes,String 'b' is present in string 'a'");
	        } else {
	            System.out.println("String 'b' is not present in string 'a'");
	        }

	    }

}
