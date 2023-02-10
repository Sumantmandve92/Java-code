package i_String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondWayOfContains {

	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher("abababababababababaab");
		while(m.find()) 
		{
			System.out.println(m.start());
		}

		System.out.println((int)(3*Math.random()));
	}

}
