package i_String;


public class FrequencyOfEachChar {

	public static void main(String[] args) {
		
		String s1="aghsdha shsdhds";
		
		char[] ch=new char[s1.length()];
		int[] a=new int[s1.length()];
		
		int index=0;
		for (int i = 0; i < s1.length(); i++) 
		{
			int left=0,right=0;
			for (int j = 0; j < s1.length(); j++)
			{
				if(s1.charAt(i)==s1.charAt(j) && j<=i) 
				{
					left++;
				}
				else if(s1.charAt(i)==s1.charAt(j)) 
				{
					right++;
				}
			}
			if(right==0) 
			{
				ch[index]=s1.charAt(i);
				a[index]=left;
				index++;
			}
		}
		
		for (int i = 0; i < index; i++)
		{
			for (int j = i+1; j < index; j++) 
			{
				if(a[i]<a[j]) {
					int temp1=a[i];
					a[i]=a[j];
					a[j]=temp1;
					char temp2=ch[i];
					ch[i]=ch[j];
					ch[j]=temp2;
				}
			}
		}
		for (int i = 0; i <index; i++)
		{
			System.out.println(ch[i]+" "+a[i]);
		}
		System.out.println();
		
		
		int max=Integer.MIN_VALUE;
		int secMax=0;
		for (int i = 0; i <index; i++) 
		{
			if(max<a[i]) 
			{
				max=a[i];
			}
			
		}
		int secInd=0;
		for (int i = 0; i <index; i++) 
		{
			if(max!=a[i]&& secMax<a[i] ) 
			{
				secMax=a[i];
				secInd=i;
				
			}
		}
		System.out.println(ch[secInd]+" "+secMax);
		
	}
}
