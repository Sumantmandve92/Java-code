package h_array;

//lecture 1: array contains given element(linear search)

public class LinearSearch {

	public static void main(String[] args) {
		
		
		int[] a= {5,67,4,5,6,8,9,7};
		
		int num=5,cnt=0,b=0;
		
		
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]==num) 
			{
				b=i;
				cnt++;
				break;
			}
		}
		
		if(cnt==0) 
		{
			System.out.println("not found");
		}
		else 
		{
			System.out.println(num+" found at index :"+b);
		}

	}

}
