package b_objects;

public class ObjectArgs {

	public static void main(String[] args) {
		
		print(new U());
		print(new V());
		print((U)new V());
		print(new Z());
		print((U)new Z());
		print((Y)new Z());
		print((W)new X());
	}
	public static void print(Object a) 
	{
		System.out.print((a instanceof U) ? "U":"");
		System.out.print((a instanceof V) ? "V":"");
		System.out.print((a instanceof W) ? "W":"");
		System.out.print((a instanceof X) ? "X":"");
		System.out.print((a instanceof Y) ? "Y":"");
		System.out.print((a instanceof Z) ? "Z":"");
		System.out.print(" ");
		
	}

}
class U
{}
class V extends U
{}
interface W
{}
class X extends V implements W
{}
interface Y extends W
{}
class Z extends U implements Y
{}

