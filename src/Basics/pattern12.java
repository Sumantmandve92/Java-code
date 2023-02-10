package Basics;

public class pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1='A';
		 for(int i=0;i<6;i++)
		 {
			 char ch=ch1;
			 for(int j=0;j<6;j++)
			 {
				 if(i>=j)
				 {
					System.out.print(ch);
					ch=(char)(ch+5);
				 }
			 }
			 System.out.println();
			 ch1++;
		 }
	}

}
