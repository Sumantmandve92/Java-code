package h_array;

public class Remove1From2 {
	public static void main(String[] args) {
		int []n= {1,2,4};
		int[] a= {1,1,1,1,1,2,2,3,4};
		for(int j=0;j<n.length;j++) 
		{
			int cnt=0;
			for(int i=0;i<a.length;i++) 
			{
				if(a[i]==n[j]) {
					cnt++;
				}
				if(cnt==2) {
					break;
				}
			}
			//but 
			int[] b=new int [a.length-cnt];
			int bInd=0;
			int removedCount=0;
			for(int i=0;i<a.length;i++){
				if(a[i]!=n[j]||removedCount>=2) 
				{
					b[bInd++]=a[i];
				}
				else 
				{
					removedCount++;
				}
			}
			a=b;
		}
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]+" ");
		}

	}

}
