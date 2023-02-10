package l_StackImplementation;

public class MyQueue {

	int[] a=new int[5];
	int i1=0;
	int i2=0;
	int count=0;
	void push(int num) 
	{
		if(count>=a.length) 
		{
			System.out.println("Queue is full");
		}
		else 
		{
			a[i1]=num;
			i1++;
			count++;
			if(i1==a.length) 
			{
				i1=0;
			}
		}
	}
	int pop() 
	{
		if(count<=0) 
		{
			System.out.println("Queue is empty");
			return 0;
		}
		else 
		{
			int oldI2=i2;
			i2++;
			count--;
			if(i2==a.length) 
			{
				i2=0;
			}
			return a[oldI2];
		}
	}
			
	
	
	
	
	public static void main(String[] args) {
	
		
		MyQueue queue=new MyQueue();
		
		queue.push(10);
		queue.push(20);
		queue.push(30);
		queue.push(40);
		queue.push(50);
		queue.push(60);
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		

	}

}
