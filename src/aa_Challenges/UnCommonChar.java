package aa_Challenges;

//o/p=fioqruz
public class UnCommonChar {

	public static void main(String[] args) {
		String s1="geeksforgeeks";
		String s2="geeksquiz";
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		//check first in sec string
		for (int i = 0; i < ch1.length; i++) 
		{
			int noCommonFound=0;
			for (int j = 0; j < ch2.length; j++) 
			{
				if(ch1[i]==ch2[j]) 
				{ noCommonFound++;
					break;
				}
			}
			if(noCommonFound==0) 
			{
				System.out.print(ch1[i]);
			}
		}
		//check sec in first
		for (int i = 0; i < ch2.length; i++) 
		{
			int noCommonFound=0;
			for (int j = 0; j < ch1.length; j++) 
			{
				if(ch2[i]==ch1[j]) 
				{ noCommonFound++;
					break;
				}
			}
			if(noCommonFound==0) 
			{
				System.out.print(ch2[i]);
			}
		}
		

	}

}
