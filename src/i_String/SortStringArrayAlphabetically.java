package i_String;

public class SortStringArrayAlphabetically {

	public static void main(String[] args) {
		String[] s1= {"sumant","reena","nirbhay","abhay","rrr","r","shourya","rushikesh","sumedh","rohan","mohan","kk"};
		for (int i = 0; i < s1.length; i++) 
		{
			//j for loop is for selecting two strings to compare
			for (int j = 0; j < s1.length-1; j++) 
			{
				boolean flag =true;
				char[] ch1=s1[j].toCharArray();
				char[] ch2=s1[j+1].toCharArray();
				//k for loop is to compare char at k'th index of both strings
				for (int k = 0; k < ch2.length && k<ch1.length; k++)
				{
					if(ch1[k]>ch2[k])
					{//if first is greater then swap.if they swapped no need to check its length
						flag=false;
						String temp=s1[j];
						s1[j]=s1[j+1];
						s1[j+1]=temp;
						break;
					}
					else if(ch1[k]<ch2[k]) 
					{//if first is less .means they are already on proper place
						flag =false;
						break;
					}
					//if found equal char, check next char
				}
				if(flag)
				{
					if(ch1.length>ch2.length)
					{//means j'th string starts with (j+1)'th string ,then swap ascending order by its length
						String temp=s1[j];
						s1[j]=s1[j+1];
						s1[j+1]=temp;
					}
				}
			}
		}
		for(String s:s1){
			System.out.println(s);
		}

	}

}
