package f_abstraction;



interface I2
{
	default void m1() 
	{
		System.out.println("default method of interface I1");
	}
}
interface I3
{
	default void m1() 
	{
		System.out.println("default method of interface I2");
	}
}
public class Demo1 implements I2,I3
{
	/*
	 * if default method is of same structure in(I1 and I2) multiple inheritance
	 * then we have to override in implemented/subclass
	 * $if u want to call that method in the following way
	 */
@Override
	public void m1() {
		
		I2.super.m1();
	}

}