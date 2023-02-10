package r_RecursionArray;
public class Strictly_inc_dec {

	public static void main(String[] args) {
	
		int[] a= {5,1,3,6,8,2,9,0,10};
		int[] incA=new int[a.length];
		int[] decA=new int[a.length];
		
		Info obj=new Info();
		// locate first two elements of array a into array incA and decA
		//bigger in decA and smaller in incA
		if(a[0]>a[1]) 
		{
			incA[0]=a[1];
			obj.incEle=a[1];
			decA[0]=a[0];
			obj.decEle=a[0];
		}
		else 
		{
			incA[0]=a[0];
			obj.incEle=a[0];
			decA[0]=a[1];
			obj.decEle=a[1];
		}
		int num=loopI(2,incA,decA,a,obj);
		if(num==0) 
		{//num=0 means there is no such element in array a that does not fall under incA and decA condition.
			print(0,incA,obj);
			System.out.println();
			print(decA,0,obj);
		}
		else 
		{
			System.out.println(-1);
		}
	}//sort elements of array 'a' into array inA and decA
	private static int loopI( int k, int[] incA, int[] decA, int[] a,Info obj) {
		if(k<a.length) 
		{
			if(a[k]>obj.incEle) 
			{
				incA[obj.incI++]=a[k];
				obj.incEle=a[k];
			}
			else if(a[k]<obj.decEle) 
			{
				decA[obj.decI++]=a[k];
				obj.decEle=a[k];	
				
			}
			else 
			{
				return -1;
			}
			k++;
			return loopI( k, incA, decA, a, obj);
		}
		return 0;
	}//print inc array
	private static void print(int[] decA, int i,Info obj) {
		if(i<obj.decI) 
		{
			System.out.print(decA[i]+" ");
			i++;
			print(decA, i, obj);
		}
		
	}//print dec array
	private static void print(int i, int[] incA,Info obj) {
		
		if(i<obj.incI)
		{
			System.out.print(incA[i]+" ");
			i++;
			print(i, incA, obj);
		}
		
	}
}
class Info
{

	//Latest elements
	int incEle;
	int decEle;
	
	//indexes
	int incI=1;
	int decI=1;
}
