package h_array;

public class RemoveDup1 
{

	public static void main(String[] args) 
	{
		
		
		int a[]= {1,2,4};
		int b[]= {1,1,1,1,1,2,2,2,3,3,3,4,5};
		int cnt=0;
		for(int i=0;i<a.length;i++) 
		{int cnt1=0;
			for(int j=0;j<b.length;j++) 
			{
				if(a[i]==b[j]&&cnt1<2) 
				{
					cnt++;  //this count is for all element in array a
					cnt1++;//this count is for find  duplicate  of each element
				}
				if(cnt1==2) 
				{
					break;
				}
			}
		}
		//create new array to put remaining elements other than in array a
		int[] c=new int [b.length-cnt];
		int cInd=0;
		
		
		for(int i=0;i<a.length;i++) 
		{
			int cnt1=0;
			for(int j=0;j<b.length;j++) 
			{
				if(a[i]==b[j]&&cnt1<=2) 
				{
					  //this count is for all element in array a
					cnt1++;//this count is for find  duplicate  of each element
				}
				else if(a[i]==b[j] ) 
				{
					c[cInd++]=b[j];
				}
			}
		}
		for(int i:c) 
		{
			System.out.println(i+" ");
		}
		
	}

}
