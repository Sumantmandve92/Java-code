package l_StackImplementation;

class Test
{
	int[] a=new int[5];
	int i=0,j=0;
	public  void push(int num) 
	{
			
		if(i-j>=5) 
		{
			System.out.println("full");
			if(j>0) 
			{
				i=0;
			}
			
		}
		else 
		{
			a[i++]=num;
		}
	} 
	public int pop() 
	{
		return a[j++];
	}
}
public class Trial {

	public static void main(String[] args) {
		
		Test s=new Test();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
	}

}
