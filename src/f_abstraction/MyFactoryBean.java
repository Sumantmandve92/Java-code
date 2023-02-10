package f_abstraction;

import h_array.Remove1From2;

public class MyFactoryBean {

	public static void main(String[] args) {
		

		Factory factory=new Data();
System.out.println(		factory.m1());
		
	}

}
 interface Factory {

	// method to create all instances of beans/class
	public int m1();
	default void m2() {};

	// method which returns the provided bean
}

class Data implements Factory {

	@Override
	public int m1() {
		// TODO Auto-generated method stub
		return 25;
	}

}
