package t_thread;

class Print 
{
	
	 static void show(int num) 
	{
		for (int i = 0; i < num; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	
	static void m1() 
	{
		for (int i = 0; i < 5; i++) 
		{
			
		
		System.out.println(Thread.currentThread().getName());
		}
	} 
}

class Th1 extends Thread
{
	@Override
	public void run() {
		Print.show(5);
	}
}
class Th2 extends Thread
{
	@Override
	public void run() {
		Print.show(5);
	}
}
class Th3 extends Thread
{
	@Override
	public void run() {


		Print.m1();
	}
	
}
public class ClassSynchro {

	public static void main(String[] args) {
			
		Th1 thread1=new Th1();
		Th2 thread2=new Th2();
		Th3 thread3=new Th3();
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
