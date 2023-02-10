package r_RecursionArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RemoveDuplicate {

	public static void main(String[] args) {


		int[] a= {2,5,4,32,65,4,1,52,98,2,};
		//
		ArrayList<Integer> list=new ArrayList<>();
		loopi(a,0,list);
		Object[] b=list.toArray();
		for(Object i:b)
		
		System.out.print(i+" ");

	}

	private static void loopi(int[] a, int i,List list) {
		if(i<a.length) 
		{
			int count=0;
			
			count=loopj(a,i,0,count);
			if(count==0) 
			{
				list.add(a[i]);
				//System.out.println(a[i]);
				
			}
			i++;
			loopi(a, i,list);
		}
		
	}

	private static int loopj(int[] a, int i, int j,int count) {
		if(j<i) 
		{
			if(a[i]==a[j]) 
			{
				count++;
			}
			j++;
			return loopj(a, i, j,count);
		}
		return count;
	}

}
