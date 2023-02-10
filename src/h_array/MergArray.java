package h_array;

//lecture 4:Merge two array
public class MergArray {

	public static void main(String[] args) {
		
		int []a= {15,56,87,41};
		int []b= {12,56};
		int[] c=new int [a.length+b.length];
		//values of a copied into c
		int index=0;
		for(int i=0;i<a.length;i++ ) 
		{
			c[index++]=a[i];
		}
		//values of b copied into c
		for(int i=0;i<b.length;i++) 
		{
			c[index++]=b[i];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]+" ");
		}

	}

}
