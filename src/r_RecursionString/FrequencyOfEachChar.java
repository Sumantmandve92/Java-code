package r_RecursionString;

public class FrequencyOfEachChar {

	public static void main(String[] args) {
		String s1="ahsdhafshsdhds";
		char[] ch=new char[s1.length()];
		int[] a=new int[s1.length()];
		int index=0;
		int k=0;
		index=countChar(k,s1,ch,a,index);
		print(0,ch,a,index);//print
		//---------------------------
		int min=a[0];
		int lI=0;
		lI=lowest(0,a,min,index,lI);
		
		System.out.println(ch[lI]+" "+a[lI]);
	}
	private static int lowest(int i, int[] a, int min,int index,int lI) {
		
		if(i<index) 
		{
			if(min>a[i]) 
			{
			lI=i;
			}
			i++;
			return lowest(i, a, min, index,lI);
		}
		return lI;
	}
	private static int  countChar(int i, String s1, char[] ch, int[] a, int index) 
	{
		if(i<s1.length())
		{
			int[] freq= {0,0};
			frequency(freq,0,i,s1);
			if(freq[1]==0)
			{
				ch[index]=s1.charAt(i);
				a[index]=freq[0];
				index++;
			}
			i++;
			return countChar(i, s1, ch, a, index);
		}
		return index;
	}
	private static void frequency(int[] freq, int j, int i, String s1) 
	{
		if(j<s1.length()) 
		{
			if(s1.charAt(i)==s1.charAt(j) && j<=i) 
			{
				freq[0]++;
			}
			else if(s1.charAt(i)==s1.charAt(j)) 
			{
				freq[1]++;
			}
			j++;
			frequency(freq, j, i, s1);
		}
	}
	private static void print(int i, char[] ch, int[] a, int index)
	{
		if(i<index) 
		{
			System.out.println(ch[i]+" "+a[i]);
			i++;
			print(i, ch, a, index);
		}
	}

}
