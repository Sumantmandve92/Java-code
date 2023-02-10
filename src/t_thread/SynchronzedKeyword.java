package t_thread;


public class SynchronzedKeyword {

	public static void main(String[] args) {
		Display display =new Display();
		T11 thread1=new T11(display);

		T2 thread2=new T2(display);
		Th5 thread5=new Th5(display);
		thread2.start();
		thread1.start();
		thread5.start();
	}

}
