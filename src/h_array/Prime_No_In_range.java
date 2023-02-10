package h_array;

public class Prime_No_In_range {

	public static void main(String[] args) {
		int[] prime=new int[(100-1)/2];
		int index=0;
		for (int i = 1; i <= 100; i++) 
		{
		
			int cnt=0;
			for (int j = 2; j < i; j++) 
			{
				if(i%j==0) 
				{
					
					break;
				}
				else 
				{
					cnt++;
				}
			}
			if(cnt==(i-2)) 
			{
				prime[index++]=i;
				System.out.println(i);
			}
			
		}
		int[] prime1=new int[index];
		for (int i = 0; i < prime1.length; i++) 
		{
			prime1[i]=prime[i];
		}
		

	}

}
