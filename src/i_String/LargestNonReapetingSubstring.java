package i_String;

public class LargestNonReapetingSubstring 
{
	public static void main(String[] args)
	{//given string
		String string="abcdeabcdef";
		//previous maximum string=pre
		String pre="";
		//latest maximum string=now
		String now="";
		loopi:for (int i = 0; i < string.length(); i++)
		{//loopi=name of i loop
			loopj:for (int j = i; j < string.length(); j++)
			{//loopj=name of j loop
				boolean flag=true;
				int k=i;
				for (; k < j; k++) 
				{
					if(string.charAt(j)==string.charAt(k))
					{
						flag=false;
						break;	
					}
				}
				if(flag)
				{//if flag is true means j'th char is not duplicate so  add it in 'now' string
					now=now+string.charAt(j);
				}
				else
				{//if j'th char found duplicate update 'pre'  by 'now'(if condition satisfied)
					if(now.length()>pre.length())
					{
						pre=now;
					}
					i=k;
					//after updating 'pre' string NOW  'now' string is of no use ,so empty it for upcoming max string
					now="";
					if(j==string.length()-1) 
					{
						break loopi;
					}
					break;
				}
//				if(j==string.length()-1 )
//				{//if j is reached at last index of string(if whole string has no duplicate char)
//					pre=now;
//					break loopi;
//				}
			}
		}
		System.out.println("Non reapeting charactor largest substring :: "+pre);
		
		
		
	}
}
