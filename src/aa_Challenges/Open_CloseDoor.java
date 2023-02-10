package aa_Challenges;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Check if the door is open or closed
Given n doors and n persons. The doors are numbered 1 to n and persons are given id’s numbered 1 to n. Each door can have only 2 status open and closed. Initially all the doors have status closed. Find the final status of all the doors if a person changes the current status of all the doors, i.e. if status open then change to status closed and vice versa, for which he is authorized. A person with id ‘i’ is authorized to change the status of door numbered ‘j’ if ‘j’ is a multiple of ‘i’. 
Note: 
– A person has to change the current status of all the doors for which he is authorized exactly once. 
– There can be a situation that before a person changes the status of the door, another person who is also authorized for the same door changes the status of the door. 
Example : 
 

Input : 3
Output : open closed closed
 */
public class Open_CloseDoor {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter  number of doors :");
		int d=scanner.nextInt();
		
		int[] a=new int[d+1];
		
		//0->closed and 1->open
		
		for (int i = 1; i < a.length; i++)//person number
		{
			for (int j = 1; j < a.length; j++) //door number
			{
				if(j%i==0 && a[j]==0)
				{
					a[j]=1;
				} 
				else if(j%i==0  && a[j]==1)
				{
					a[j]=0;
				}
			}
			//System.out.println(Arrays.toString(a));
		String[] s=new String[d];
		for (int j = 1; j < a.length; j++) 
		{
			if(a[j]==0) 
		    {
				s[j-1]="closed";
		    }
		   else 
		   {
			   s[j-1]="open";  
		   }
		}
		System.out.println(Arrays.toString(s));
		}
	}
	
	
}
