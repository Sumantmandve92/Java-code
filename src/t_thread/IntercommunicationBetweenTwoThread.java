package t_thread;

//notify() and wait() method
class Chochlate
{
	int ch=0;
	synchronized void producer(int qty) 
	{
		if(ch>=20) 
		{
			try {
				System.out.println(Thread.currentThread().getName()+"Producer Waiting...!!");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		ch=ch+qty;
		
			System.out.println(Thread.currentThread().getName()+"Produced..."+ch);
		notify();
		
	}
	
	synchronized void consumer() 
	{
		
		
		if(ch<=6) 
		{
			try {
				System.out.println(Thread.currentThread().getName()+"I am Waiting....!");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		while(ch>6) 
		{
			ch=ch-6;
		}
		System.out.println(Thread.currentThread().getName()+"remaining chochlate"+ch);
		notify();
	}
	
}
class Producer extends Thread
{
	Chochlate ch;
	public Producer(Chochlate ch) {

		this.ch=ch;

	}

	@Override
	public void run() {
		int i=0;
		while(i<10)
		{
			
		ch.producer(10);
		i++;
			
		}
	}
	
}
class Consumer extends Thread
{
	Chochlate ch;
	public Consumer(Chochlate ch) {
		this.ch=ch;
	}
	@Override
	public void run() {
		while(true) {
		ch.consumer();}
	}
}
public class IntercommunicationBetweenTwoThread {

	public static void main(String[] args) {

		Chochlate ch=new Chochlate();
		Producer p1=new Producer(ch);
		Consumer c1=new Consumer(ch);
		p1.start();
		c1.start();


	}

}
