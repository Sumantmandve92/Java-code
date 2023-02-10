package aa_Challenges;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniqueElementSize {

	public static void main(String[] args) {
		
		int[] a= {5,5,7,-5,-7,1,2,-2};
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]>0) 
			{
				list.add(a[i]);
				
			}
			else 
			{
				int index=list.indexOf(-a[i]);
				list.remove(index);
			}
			HashSet<Integer> set=new HashSet<>();
			set.addAll(list);
			System.out.print(set.size()+" ");
		}
	}
}
