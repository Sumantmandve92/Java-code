package t_thread;

public class Mythread1 extends Thread {

	public void run() 
	{
		for(int i=0;i<5;i++) 
		{
			System.out.println("hi");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
