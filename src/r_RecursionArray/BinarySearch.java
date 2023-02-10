package r_RecursionArray;
public class BinarySearch {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int num=6;
		int start=0,end=a.length-1;
		int temp=loopI(num,start,end, a);
		if(temp!=-1) 
		{
			System.out.println("found at index "+temp);
		}
		else 
		{
			System.out.println("index not found");
		}
	}
	private static int loopI(int num, int start, int end, int[] a) 
	{
		if(start<=end) 
		{
			
			int mid=(start+end)/2;
			if(a[mid]==num) 
			{
			return mid;
			}
			else if(num>a[mid]) 
			{
				start=mid+1;
				
			}
			else 
			{
				end=mid-1;
			}
			
			return loopI(num, start, end, a);
				
		}
		return -1;
		
	}

}