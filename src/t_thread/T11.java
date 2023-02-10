package t_thread;

public class T11 extends Thread
{
	
	Display display;
	T11(Display display)
	{
		this.display=display;
	}
	@Override
	public void run() {
		display.show(4);
	}
}
class T2 extends Thread
{
	
	Display display;
	T2(Display display)
	{
		this.display=display;
	}
	@Override
	public void run() {
		display.show(5);
	}
}
class Th5 extends Thread
{
	
	Display display;
	Th5(Display display)
	{
		this.display=display;
	}
	@Override
	public void run() {
		display.m2();
	}
}