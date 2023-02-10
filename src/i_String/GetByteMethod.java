package i_String;

public class GetByteMethod {

	public static void main(String[] args) {
		

		 String str = "HEFSHINEz";
	        byte[] bytes = str.getBytes();
	        for (byte byt : bytes)
	        {
	            System.out.print((char) byt + " ");
	           
	        }
	}

}
