package r_RecursionString;

public class FrequencyOfCharByObject {

	public static void main(String[] args) {

		String s1="abcdabcaba";

		//object array to store objects of char-frequency pair
		MyData[] arr=new MyData[s1.length()];
		int index=0;
		index=loopi(s1,0,arr,index);
		//print frequency of each char 
		Print(index,arr,0);
		//object to  access instance var
		MyData obj= new MyData();
		
		//maximum frequency char
		max_freq(0,arr,index,obj);
		System.out.println(arr[obj.maxIndex].freq+":"+arr[obj.maxIndex].ch);
		//minimum frequency char
		sec_maxFrequency(0,arr,index,obj);
		System.out.println(arr[obj.secmaxIndex].freq+":"+arr[obj.secmaxIndex].ch);
	}

	private static void sec_maxFrequency(int i, MyData[] arr, int index,MyData obj) {


		if(i<index) 
		{
			if(arr[i].freq!=obj.max && obj.secmax<arr[i].freq ) 
			{
				obj.secmax=arr[i].freq;
				obj.secmaxIndex=i;
			}
			i++;
			sec_maxFrequency(i, arr, index, obj);
		}
	
	}

	private static void max_freq(int i, MyData[] arr, int index ,MyData obj) 
	{
		if(i<index) 
		{
			if(arr[i].freq>obj.max) 
			{
				obj.max=arr[i].freq;
				obj.maxIndex=i;
			}
			i++;
			 max_freq(i, arr, index,obj);
		}
		
		
	}

	private static void Print(int index, MyData[] arr, int i) {
		if(i<index) 
		{
			System.out.println(arr[i].ch+" = "+arr[i].freq);
			i++;
			Print(index, arr, i);
		}
	}		

	private static int loopi(String s1, int i,MyData[] arr,int index) 
	{
		if(i<s1.length()) 
		{
			int count=0;

			count=loopj(i,s1,0,count);

			if(count==0)
			{
				int count1=0;

				count1=loopk(i,0,s1,count1);

				MyData data=new MyData(count1, s1.charAt(i));
				//System.out.println(count1+" "+);
				arr[index++]=data;
			}
			i++;
			return loopi(s1, i, arr,index);
		}
		return index;	}
	private static int loopk(int i, int k, String s1, int count1) {		if(k<s1.length()) 		{			if(s1.charAt(i) == s1.charAt(k) )				count1++;			k++; return loopk(i, k, s1, count1);		}		return count1;	}	private static int loopj(int i, String s1, int j, int count) {		if(j<i) 		{			if(s1.charAt(i)==s1.charAt(j)) 			{				count++;			}			j++;			return loopj(i, s1, j, count);		}		return count;	}}class MyData{	char ch;	int freq;	public MyData(int freq,char ch) {		this.ch=ch;		this.freq=freq;	}
	int max=Integer.MIN_VALUE;
	int secmax=Integer.MIN_VALUE;
	int maxIndex=0,secmaxIndex=0;
	public MyData() {}}
