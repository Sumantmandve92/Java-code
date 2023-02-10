package h_array;

//lecture 2:Remove  Duplicate elements from an array

public class RemoveDupElements {

	public static void main(String[] args) {
		
		
		int [] a= {1,2,5,4,5,4,5,8,45,4,45,3};
		//count number of duplicate elements
		int cnt=0;
		 for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<i;j++) 
			{
				if(a[i]==a[j]) 
				{
					cnt++;
				break;
				}
			}
		}
		 System.out.println(a.length-cnt);
		 //create second array of length a.length-cnt
		 int bInd=0;
		 int []b=new int [a.length-cnt];
		 //assign values 
		 for(int i=0;i<a.length;i++) 
			{
				int count=0;
				for(int j=0;j<i;j++) 
				{
					if(a[i]==a[j]) 
					{
						count=1;
					break;
					}
				}
				if(count==0) 
				{
				b[bInd]=a[i];
				bInd++;
				}
			}
		
		 for (int i = 0; i < a.length; i++) 
		 {
				for (int j = 0; j < a.length; j++)
				{
					
					System.out.print("(" + a[i] + ", " + a[j] + ") ");
				}
			}
	}

}
