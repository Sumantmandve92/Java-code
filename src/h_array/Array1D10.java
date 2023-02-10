package h_array;


//lecture 2: put even and odd elements of a array in two separate arrays

public class Array1D10 {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7,89,12,4,5,76,1,1};
		int evenCnt=0;
		int oddCnt=0;
		//count even and odd numbers.......................................
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2==0) 
			{
				evenCnt++;
			}
			else 
			{
				oddCnt++;
			}
		}
		//create new arrays for even and odd numbers...............................
		int [] evenArray=new int[evenCnt];
		int [] oddArray=new int [oddCnt];
		
		int evenIndex=0;
		int oddIndex=0;
		
	//taking values from array 'a'  and assigning to respective array(even or odd)...... 
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2==0) 
			{
				evenArray[evenIndex++]=a[i];
				
			}
			else 
			{
				oddArray[oddIndex++]=a[i];
			}
		}
		//print both even and odd array..................
		
		
		System.out.println("even numbers");
		for(int i=0;i<evenArray.length;i++) 
		{
			System.out.print(evenArray[i]+" ");
		}
	
		System.out.println("\nodd numbers");
		for(int i=0;i<oddArray.length;i++) 
		{
			System.out.print(oddArray[i]+" ");
		}
	}

}
