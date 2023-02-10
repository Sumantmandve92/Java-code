package h_array;



//lecture 2: binary search(array should be sorted already)

public class BinarySearch {

	public static void main(String[] args) {
	
		int a[]= {41,42,43,44,45,46,47,48,49};
		int element=43;
		int first=0;
		int last=a.length-1;
		int mid=(first+last)/2;
		
		while(first<=last) 
		{
			if(element==a[mid]) 
			{
				System.out.println(element+"found at index : "+mid);
				break;
			}
			else if(element>a[mid]) 
			{
				//search element in right half array after mid value
				//and first will shifted to right
				first=mid+1;
			}
			else 
			{
				//search element in left half array before mid value
				//and last will shifted to right
				last=mid-1;
			}
			mid=(last+first)/2;
		}
		if(first>last) 
		{
			System.out.println(element+" not found");
		}

	}

}
