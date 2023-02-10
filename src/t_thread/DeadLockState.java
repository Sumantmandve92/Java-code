package t_thread;

class Train1 {
	synchronized void m1(Train2 key2) {
		System.out.println("m1() of train1");
		key2.m2();
	}
	synchronized void m2() {
		System.out.println("m2() of train1");
	}
}
class Train2 {
	synchronized void m1(Train1 key1) {
		System.out.println("m1() of train2");
		key1.m2();
	}
	synchronized void m2() {
		System.out.println("m2() of train2");
	}
}
//thread class
class Pilot1 extends Thread {
	Train1 key1;
	Train2 key2;

	public Pilot1(Train1 key1, Train2 key2) {
		this.key1 = key1;
		this.key2 = key2;
	}

	@Override
	public void run() {
		key1.m1(key2);
	}
}
//thread class
class Pilot2 extends Thread {
	Train1 key1;
	Train2 key2;
	public Pilot2(Train1 key1, Train2 key2) {
		this.key1 = key1;
		this.key2 = key2;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			key2.m1(key1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class DeadLockState {
	public static void main(String[] args) {
		Train1 key1 = new Train1();// cr1
		Train2 key2 = new Train2();// cr2
		Pilot1 P1 = new Pilot1(key1, key2);// Thread
		Pilot2 P2 = new Pilot2(key1, key2);// thread
		P1.start();
		P2.start();
	}

}
