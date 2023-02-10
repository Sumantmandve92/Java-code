package r_RecursionArray;

public class LeastSubArray {

	public static void main(String[] args) {
		
		int[] a= {2,6,4,9};
		int k=3;
		Data obj=new Data();
		loopI(0,a,k,obj);
		System.out.println(obj.minAvg);
		System.out.println(obj.index);

	}

	private static void loopI(int i, int[] a, int k,Data obj) 
	{
		
		if(i<a.length-k+1) 
		{
			int sum=0;
			sum=loopJ(i,0,a,k,obj,sum);
			int avg=sum/k;
			if(avg<obj.minAvg) 
			{
				obj.minAvg=avg;
				obj.index=i;
			}
			i++;
			loopI(i, a, k, obj);
		}
		
		
	}

	private static int loopJ(int i, int j, int[] a, int k, Data obj,int sum) {
		
		if(j<k+i) 
		{
			sum=sum+a[j];
			j++;
			return loopJ(i, j, a, k, obj, sum);
		}
		return sum;
	}

}
class Data
{
	int index;
	int minAvg=Integer.MAX_VALUE;
	
}
