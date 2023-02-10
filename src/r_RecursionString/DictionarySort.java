package r_RecursionString;

public class DictionarySort {

	public static void main(String[] args) {
		String[] s1= {"sumant","reena","nirbhay","abhay","rrr","r","shourya","rushikesh","monali","sumedh","rohan","mohan","komal"};
		//use bubble sort concept
		//i for loop is for number of strings in string array
		element1(0,s1);
		for(String s:s1){
			System.out.println(s);
		}
	}
	private static void element1(int i, String[] s1) {
		if(i<s1.length) {
			element2(i,0,s1);
			i++;
			element1(i, s1);
		}
	}
	private static void element2(int i, int j, String[] s1) {
		if(j<s1.length-1) { 
			char[] ch1=s1[j].toCharArray();
			char[] ch2=s1[j+1].toCharArray();
			boolean flag=true;
			flag=checkChar(0,j,ch1,ch2,flag,s1);
			if(flag){
				if(ch1.length>ch2.length)
				{//means j'th string starts with (j+1)'th string ,then swap ascending order by its length
					String temp=s1[j];
					s1[j]=s1[j+1];
					s1[j+1]=temp;
				}
			}
			j++;
			element2(i, j, s1);
		}
	}
	private static boolean checkChar(int k, int j, char[] ch1, char[] ch2, boolean flag, String[] s1) {
		if(k<ch1.length && k<ch2.length) {
			if(ch1[k]>ch2[k]){
				String temp=s1[j];
				s1[j]=s1[j+1];
				s1[j+1]=temp;
				return false;
			}
			else if(ch1[k]<ch2[k]) 
			{//if first is less .means they are already on proper place
				return false;
			}
			k++;
			checkChar(k, j, ch1, ch2, flag, s1);
		}
		return true;
	}
}