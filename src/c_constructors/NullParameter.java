package c_constructors;

public class NullParameter {

	public static void main(String[] args) {


		new Vishal(null);
		new Vishal(null);

	}

}
class Vishal
{

	public Vishal(Object o) 
	{
		System.out.println("hi");
	}
	public Vishal(double[] d) 
	{
		System.out.println("hello");
	}
}
