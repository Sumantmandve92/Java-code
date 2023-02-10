package e_polymorphism;



class Main
{
	//final method can never be override
	final void main() 
	{
		
	}
	
	 String message() 
	{
		return "Hello";
	}
}
class MainClass extends Main
{
	public static void main(String[] args) {
		System.out.println();
	}
	// return type of overridden method should be same type
	String message() 
	{
		return "Hi";
	}
}
