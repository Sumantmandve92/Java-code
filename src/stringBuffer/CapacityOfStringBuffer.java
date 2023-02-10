package stringBuffer;

public class CapacityOfStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb1=new StringBuffer("");
		
		System.out.println(sb1.capacity());// capacity of empty string buffer is 16 always
		sb1.append("abcdefghijklm");
		System.out.println();
		System.out.println(sb1.capacity());
		sb1.append("abcdefghijklm");
		System.out.println();
		System.out.println(sb1.capacity());
		sb1.append("abcdefghijklm");
		System.out.println();
		System.out.println(sb1.capacity());
		sb1.append("abcdefghijklm");
		
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		//if we insert upto the length 16 capacity of that string will not change 
		//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
		//a b c d e f g h i j  k  l  m                 
		
		
		//if we insert beyond the length 16 ,capacity of that string will change by 2 
		//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34
		
		
		
	}

}
