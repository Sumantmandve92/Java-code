package b_objects;


class Complex
{
	int re;
	int im;
	
	public Complex(int re, int im) 
	{
		this.im=im;
		this.re=re;
	}
	public  Complex(Complex a) 
	{
		re=a.re;
		im=a.im;
		System.out.println("hi");
	}
}


//main method
public class ContainmentOfObject1 {
	public static void main(String[] args) {
	
		Complex c1=new Complex(10,20);
		Complex c3=new Complex(c1);
		Complex c2=new Complex(c3);
		System.out.println(c1);
		System.out.println(c2.re);
	}

}
