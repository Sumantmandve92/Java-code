package stringBuffer;

public class DeleteMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb1=new StringBuffer("Welcome");
		
		//delete char from index 3 upto 4 but not 4'th char
		sb1.delete(3, 4);
		System.out.println(sb1);
	}

}
