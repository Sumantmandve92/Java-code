package l_StackImplementation;


class MyStack
{

	int [] a=new int[5];
	int index=0;
	void push(int num) 
	{ 
		if(index>a.length-1) 
		{
			
			System.out.println("Array is full already. we can not push "+num);
		}
		else 
		{
		a[index++]=num;
		}
	}
	int pop() 
	{
		
		if(index<=0) {
			
			System.out.println("empty stack");
			return 0;
		}
		else 
		{
		return a[--index];
		}
	}
}
public class MyClass {

	public static void main(String[] args) {


		MyStack stack=new MyStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
