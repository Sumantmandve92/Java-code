package i_String;

public class SubsequenceMethod {

	public static void main(String[] args) {
		
		
		String str = "hi welcome hefshine";
        System.out.print(str.startsWith("The") + ", ");
        System.out.print(str.endsWith("capabilities.") + ", ");
        System.out.print(str.endsWith("lities.") + ", ");
        System.out.print(str.startsWith("ith", 3) + ", ");
        System.out.println(str.subSequence(2, 6));
        
        
        String str1="Java";
        String str2 = new String("java");
        
        System.out.println(str1 == str2);
         
        System.out.println(str1.equals(str2));
         
        System.out.println(str2.hashCode());//hashcode calculated on the basis of content of object
        int [] a= {65,66,67,68,69};
        String string=new String(a,1,3);
        System.out.println(string);

	}

}
