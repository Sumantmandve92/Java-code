package a_classes;

import java.util.Formatter;

public class FFormatterClass {

	public static void main(String[] args) {
		
		int[] a= {1,2 ,3,4,5,6,7,8,9,10};
		Formatter fmt= new Formatter();
		fmt.format("%10s%10s%10s\n", "Number","Square","Cube");
		for (int n : a) {
			fmt.format("%10s%10s%10s\n", n,(n*n),(n*n*n));
		}
		System.out.println(fmt);

	}

}
