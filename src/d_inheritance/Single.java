package d_inheritance;

public class Single {

	public static void main(String[] args) {
	
		Child data=new Child();
		//we can assign parent and child class instance var.by using reference data
		data.i=10;
		data.j=20;
		
	}

}
class Parent
{
	int i;
}
class Child extends Parent
{
	int j;
}
