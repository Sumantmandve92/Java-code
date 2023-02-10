package i_String;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		
		
		String string= "You all are very very very good students";
		System.out.println(string);
		String[] sa=string.split(" ");
		
		//output1
//		System.out.println("Output1 :");
//		for (int i = 0; i < sa.length; i++) 
//		{
//			char[] ch=sa[i].toCharArray();
//			int start=0;
//			int end=ch.length-1;
//			while (start<end)
//			{
//				char temp=ch[start];
//					ch[start]=ch[end];
//					ch[end]=temp;
//					start++;
//					end--;
//				
//			}
//			sa[i]=new String(ch);
//		}
//		//
//		for (int i = 0; i < sa.length; i++)
//		{
//			System.out.print(sa[i]+" ");
//		
//		}
		
		//output2
		System.out.println("output 2");
		
	}

}
