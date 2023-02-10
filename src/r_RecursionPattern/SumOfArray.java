package r_RecursionPattern;

public class SumOfArray {

	public static void main(String[] args) {
		
		
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int i=0;
		int sum=0;
		sum=sumArrayEle(a,i,sum);
		System.out.println(sum);

	}

	private static int sumArrayEle(int[] a, int i, int sum) {
	
		if(i<a.length) 
		{
			sum=sum+a[i];
			i++;
			return sumArrayEle(a, i, sum);
		}
		return sum;
	}

}
