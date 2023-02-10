package h_array;

public class StrinctlyInc_Dec {

	public static void main(String[] args) {
		int[] a= {5,1,3,6,8,2,9,0,10};
		int[] incA =new int[a.length];
		int[] decA =new int[a.length];
		//take temporary variables for latest element of incA and decA array
		int incEle=0;
		int decEle=0;
		//split first two elements in incA and decA array
		//the greater element between first two should placed in decreasing array
		//the smaller element between first two should placed in increasing array
		if(a[0]>a[1]) 
		{
			decA[0]=a[0];
			incA[0]=a[1];
			//latest element of incA array
			incEle=a[1];
			//latest element of decA array
			decEle=a[0];
		}
		else 
		{
			decA[0]=a[1];
			incA[0]=a[0];
			//latest element of incA array
			incEle=a[0];
			//latest element of decA array
			decEle=a[1];
		}
		//indexes of incA and decA array
		//we have placed one-one element at 0th position of inc and dec array
		//so indexes starts from 1st position of incA and decA array.
		int incInd=1;
		int decInd=1;
		//start comparing each element with latest element of incA and decA array
		for(int i=2;i<a.length;i++ ) 
		{
			// first check a[i] is greater than latest element of incA array(i.e. incEle)
			//if yes  then put into incA array and update 'incEle'
			if(a[i]>incEle) 
			{
				incA[incInd++]=a[i];
				incEle=a[i];
			}
			// first check a[i] is less than latest element of decA array(i.e. decEle)
			//if yes  then put into decA array and update 'decEle'
			else if(a[i]<decEle) 
			{
				decA[decInd++]=a[i];
				decEle=a[i];
			}
			//if both conditions not satisfied then ,we conclude that array 'a' can not be a set of increasing and decreasing array.
			else 
			{
				System.out.println(-1);
				//break; is used for exit from current loop only
				//System.exit(); used to exit from whole program 
				System.exit(0);
			}
		}
		//if control is not in last else part then both array will be printed.
		//we have to print both arrays upto which we have added the elements
		for (int i = 0; i < incInd; i++) 
		{
			System.out.print(incA[i]+" ");
		}
		for (int i = 0; i < decInd; i++) 
		{
			System.out.print(decA[i]+" ");
		}
		

	}

}
