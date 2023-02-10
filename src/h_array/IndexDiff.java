package h_array;

//lecture 4:find the difference between indexes of given two elements

public class IndexDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m=6,n=2,nIndex=0,mIndex=0;
		int []a= {1,2,5,8,9,7,6,5,2,8,6,7};
		for (int i = 0; i < a.length; i++) {
			if(a[i]==2) 
			{
				nIndex=i;
				break;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]==6) 
			{
				mIndex=i;
				break;
			}
		}
		System.out.println(mIndex-nIndex);
	}

}
