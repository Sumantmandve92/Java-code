package h_array;

//lecture 3:leader elements
public class LeaderElement {

	public static void main(String[] args) {
		
		//leader element which is greater than all proceeding elements
		int[] a= {54,64,2,84,9,16,4,3,1,51,12,5,1,511,5,1,5};
		
		for(int i=0;i<a.length;i++) 
		{
			int cnt=0;
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]<a[j]) 
				{
					cnt++;
					break;
				}
			}
			if(cnt==0) 
			{
				System.out.println(a[i]+" ");
			}
			
		}
	
	}

}
