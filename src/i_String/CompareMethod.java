package i_String;

public class CompareMethod {

	public static void main(String[] args) {
		Boolean p1 = true;
        Boolean p2 = false;
	     myCode(p1,p2);
	}
	private static void myCode(boolean p1,boolean p2) {
		
		    Boolean pen = p1;
	        Boolean pencil = p2;
	        System.out.println(!pen.booleanValue());
	        System.out.println(Boolean.compare(pen, pencil));
	        System.out.println(pencil.compareTo(pen));
    }

}