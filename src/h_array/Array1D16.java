package h_array;
//Replace elements
public class Array1D16 {

	public static void main(String[] args) {
		
		//Replace 0 by 1
		int []a= {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0};
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==0) 
			{
				a[i]=1;
			}
			System.out.print(a[i]+" ");
		}
		

	}

}
