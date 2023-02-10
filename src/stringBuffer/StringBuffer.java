package stringBuffer;

public class StringBuffer {

	public StringBuffer(int i) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(overlay("hef", "shine", 1, 4));
	}
	
	public static String overlay(String str, String overlay, int start, int end) {
        if (str == null) 
        {    
        	return null;
        }
        if (overlay == null) 
        {
        	overlay = ""; 
        }
		int len = str.length();
		if (start < 0)
		{
			start = 0;
		}
		if (start > len) 
		{
			start = len;
		}
		if (end < 0) 
		{
			end = 0;
		}
		if (end > len) 
		{
			end = len;
		}
		if (start > end) 
		{
			int temp = start;
			start = end;
			end = temp;
        }
        return new StringBuffer(len + start - end + overlay.length() + 1).append(str.substring(0, start)).append(overlay).append(str.substring(end)).toString();
    }
}