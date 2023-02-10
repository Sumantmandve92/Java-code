package i_String;

public class StartsWithMethod {

	public static void main(String[] args) {
		
		//charAt()
		//toCharArray();
		//==       check reference address of object
		//equals();   check content of string object
		//compareTo()
		//compareToIgnoreCase();
		//startsWith()
		//startsWith("",int offset index) 
		//endsWith()
		//lastIndexOf('a') last ka 'a' kiss index par hai
		//lastIndexOf('a',2)  last ka 'a' kiss index par hai  index 2 ke pehele!
		//trim()
		
		String s1="ababcd";
		String s2="aba";
		System.out.println(s1.startsWith(s2));
		System.out.println(s1.startsWith("a", 1));
                                              //1 starting index
		System.out.println(s1.endsWith(s2));
		System.out.println(s1.concat(s2));
		
		
		
		String a=new String("Krushna");
		String b=new String("Krushna");
		
		//check content
		
		System.out.println(a.equals(b)); //true
		System.out.println(a==b);// false
		
		String s="   Mandave  ";
		int lastIndex=s.lastIndexOf('a');
		int index=s.lastIndexOf('a', 2);//2 is index from which we start searching 'a' in backward direction 
		s=s.replace('a', 'x');
		String s5=s.toUpperCase();
		System.out.println(s5);
		String s6=s.toLowerCase();
		System.out.println(s6);
		String s7=s.trim();
		System.out.println(s7);
		
		
		
		
	}

}
