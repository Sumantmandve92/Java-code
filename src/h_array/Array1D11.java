package h_array;

//lecture 2:check array a and b are  clone

public class Array1D11 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,8,5,8,9};
		int b[]= {1,2,3,4,5,6,7,8,9};
		if(a.length!=b.length) 
		{
			System.out.println("array a and b are not same length..!");
		}
		else 
		{
			int cnt=0;
			for(int i=0;i<a.length;i++) 
			{
				if(a[i]!=b[i]) 
				{
					cnt=1;
					break;
				}
				
			}
			if(cnt==0) 
			{
				System.out.println("Both arrays are same");
			}
			else 
			{
				System.out.println("both arrays are not same");
			}
		}
	}
	

}
