package t_thread;

public class Display
{

	synchronized void show(int num) 
	 {
		 for (int i = 0; i < num; i++) {
			System.out.println(num*i+" "+Thread.currentThread().getName());
		}
		 
	 }
	void m2() 
	{
		for (int i = 0; i < 5; i++) {
			
		
		System.out.println(Thread.currentThread().getName());
		}
	}
	
}
