package aa_Challenges;

import java.util.LinkedList;
import java.util.List;

public class BalancedParanthesis {

	public static void main(String[] args) {


	String s1="[()]{}{[()()]()}";
	List<Character> list=new LinkedList<Character>();
	for (int i = 0; i < s1.length(); i++) {
		list.add(s1.charAt(i));
	}
	
	while(true) 
	{
		int cnt=0;
		for (int i = 0; i < list.size(); i++) {
			if((list.get(i)=='(' && list.get(i+1)==')')
				||(list.get(i)=='{' && list.get(i+1)=='}')
				||(list.get(i)=='[' && list.get(i+1)==']')) 
			{
				list.remove(i);
				list.remove(i);
				i--;
				cnt++;
			}
			System.out.println(list);
		}
		if(cnt==0) 
		{
			break;
		}
	}
	if(list.isEmpty()) 
	{
		System.out.println(list);
		System.out.println("yes");
	}
	else 
	{
		System.out.println(list);
		System.out.println("no");
	}
	}

}
