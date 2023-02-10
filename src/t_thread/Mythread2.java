package t_thread;

public class Mythread2 extends Thread {

	public void run() 
	{
		for (int i = 0; i <5; i++) 
		{
			System.out.println("hello");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
