package stringBuffer;

public class InsertMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb1=new StringBuffer("Welcome");
		
		//delete char from index 3 upto 4 but not 4'th char
//		sb1.replace(1,2, "ell");
//		System.out.println(sb1);
//
//		 // String str1 = new String("Java");
//	         
//	      //  String str2 = new String("Java123");
//	         
//	        System.out.println(str1 == str2);
//	         
//	        System.out.println(str1.equals(str2));
//	         
//	        System.out.println(str1.hashCode() == str2.hashCode());
//	        String[] strings = {"Java", "Python", "JavaScript", "HTML", "CSS"};
//	        
//	        String languages = String.join("__", strings);
//	        System.out.println(languages);
	    	String str1 = new String("open");
			  String str2 = new String("source");
			  String str3 = new String("opengenus");
			myCode(str1,str2,str3);
		}

		private static void myCode(String str1,String str2,String str3) 
		{
			
			 
		System.out.println(str3 = str1);
		System.out.println(str2 = str3);
		System.out.println(str1 = str2);
			}
	}
}
