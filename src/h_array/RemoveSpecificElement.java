package h_array;

//lecture 2: Remove element from an array

public class RemoveSpecificElement {

	public static void main(String[] args) {
	
		int[] a= {4,8,95,64,95,50,45,67};
		int del=88;
		
		
		
		//method 2: creating new array
		int cnt=0;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]==del) 
			{
				cnt++;
			}
		}
		
		int [] b=new int [a.length-cnt];
		int bIndex=0;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]!=del) 
			{
				b[bIndex]=a[i];
				bIndex++;
			}
		}
		for(int i=0;i<b.length;i++) 
		{
			System.out.print(b[i]+" ");
		}
	}

}
