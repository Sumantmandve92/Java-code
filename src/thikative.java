import java.util.Iterator;
import java.util.TreeSet;

import com.mysql.cj.protocol.ServerSessionStateController.ServerSessionStateChanges;

public class thikative {
	public static void main(String[] args) {
		
		int irange=3;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			
			for (int j = 0; j < jrange; j++) {
				
				if(i+j>=2 && j-i<=2) 
				{
					if(j==2) 
					{
						System.out.print(i+1);
					}
					else 
					{
						System.out.print("*");
					}
					
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
//		======================================================
		int[] a= {1,2,3,-2,5};
		int maxsum=Integer.MIN_VALUE;
		for (int i = 1; i <= a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				int sum=0;
				
				for (int k = 0; k < i; k++) 
				{
					sum+=a[k];
				}
				if(sum>maxsum) 
				{
					maxsum=sum;
				}
			}
		}
		System.out.println(maxsum);
//		============================================================
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j <5; j++) 
			{
				if(j>i && i+j<4) 
				{
					System.out.print(j+1);
				}
				else 
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
//		====================================================================
		Thinkative.m1();
		Thinkative.m2();
	}

}
class Thinkative
{
	
	static void m1() 
	{
		int[] x= {2,3,4,5};
		int[] y= {1,2,3};
		int cnt=0;
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < y.length; j++) 
			{
				int a=(int)Math.pow(i, j);
				int b=(int)Math.pow(j, i);
				if(a>b) 
				{
					cnt++;
					
				}
			}
		}
		System.out.println(cnt);
	}
	static void m2() 
	{
		int[] a= {1,2,3,4,5,6,7,8,9};
		int k=3;
		int max=a[0];
//		sort first
		TreeSet<Integer> set=new TreeSet<>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		int[] b=new int[set.size()];
		int index=set.size()-1;
		for(Integer i:set) 
		{
			b[index--]=(int)(i);
		}
		System.out.println(set);
		System.out.println(b[k-1]);
		
		
	}
}
