package aa_Challenges;

import java.awt.print.Printable;

public class TableWithoutPlusOperator {

	public static void main(String[] args) {
		
//		int n=2;
//		for (int i = 1; i <=10; i=i-(-1)) {
//			
//			System.out.println(i*n);
//		}

		System.out.println(numberTable(10,2));
	}

	private static String numberTable(int i ,int num) {
		
		if(i>0) 
		{
			return numberTable(i--,num)+"\n"+i*num;
		}
		return "";
	}


	

}
