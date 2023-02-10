package h_array;

public class IntersectionOfTwoArray {

	public static void main(String[] args) {
	
		int[] a= {1,2,6,4,64,1,1,1,2,5,};
		int[] b= {1,2,4,4};
		int count=0;
		for (int i = 0; i < b.length; i++) 
		{
			int cnt=0;
			for (int j = 0; j <i; j++)
			{
				if(b[i]==b[j]) 
				{
					cnt++;
					break;
				}
			}
			if(cnt==0) 
			{
				for (int j = 0; j < a.length; j++)
				{
					if(b[i]==a[j]) 
					{
						System.out.print(b[i]+" ");
						count++;
						break;
					}
				}
			}
			
		}
		System.out.println(count);

	}

}
