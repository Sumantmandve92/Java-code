package r_RecursionArray;

public class Remove1From2 {

	public static void main(String[] args) {
		int []n= {1,2,4};
		int[] a= {1,1,1,1,1,2,2,3,4,4,5,6,7,8,9};
	     int j=0;
	     a=loopJ(a, n, j);
		//display
		display(0,a);
	}
	static int[]  loopJ(int[] z,int[] n,int j) 
	{
		if(j<n.length) 
		{
			//-----------------------------------------
			int cnt=0;
			cnt=Count(z,n,0,j,cnt);
			//but 
			int[] b=new int [z.length-cnt];
			int bInd=0;
			int removedCount=0;
			placeElements(0,j,z,n,b,bInd,removedCount);
			z=b;
			//-----------------------------------------------
			j++;
			return loopJ(z, n, j);
		}
		return z;
	}
	private static int Count(int[] a, int[] n, int i, int j, int cnt)
	{
		if(i<a.length) 
		{
			if(a[i]==n[j]) 
			{
				cnt++;
			}
			if(cnt==2) 
			{
				return cnt;
			}
			i++;
			return Count(a, n, i, j, cnt);
		}
		return cnt;
	}
	private static void placeElements(int i, int j, int[] a, int[] n,int[] b, int bInd, int removedCount) {
		if(i<a.length) 
		{
			if(a[i]!=n[j]||removedCount>=2) 
			{
				b[bInd++]=a[i];
			}
			else 
			{
				removedCount++;
			}
			i++;
			placeElements(i, j, a, n, b, bInd, removedCount);
		}
	
	}
	 static void display(int i, int[] a) {
		
		 if(i<a.length) 
		 {
			 System.out.print(a[i]+" ");
			 i++;
			 display(i, a);
		 }
		
	}

}
