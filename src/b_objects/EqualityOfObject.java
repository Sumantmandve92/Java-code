package b_objects;

public class EqualityOfObject {

	public static void main(String[] args) {
		
	A a1=new A();
	A a2=new A();
	//a1=a2;
	//once you equate ref var of both object then assigning value to instance variable by using both ref var are same 
	a1.a=10;
	a2.a=12;//update for 'a' same for both objects whether you update 'a' by using a1 or a2
	a1.name="sumant";
	a2.name="mandve";
	System.out.println(a1.a);
	System.out.println(a2.a);
	
	A a3=a1;
	if(a2==a1) 
	{
		System.out.println("yes1");
	}
	if(a2.equals(a1)) 
	{
		System.out.println("yes2");
	}
	if(a1.equals(a2)) 
	{
		System.out.println("yes3");
	}
	
		

	}

}
class A
{
	int a;
	String name;
}
