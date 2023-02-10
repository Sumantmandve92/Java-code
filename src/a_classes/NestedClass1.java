package a_classes;
// if we create private method in nested(inner) class then this private method can be accessed outside of the inner class and also important is that private method of outer class can be accessed inside the inner class
class State
{
	class District
	{
		 void show() 
		{
		State state=new State();
		state.show();
			System.out.println(" 'Private' show method from inner class");
		}
		 
	}
	private void show() 
	{
		System.out.println("show method from outer class");
	}
}
public class NestedClass1 {

	public static void main(String[] args) {
	// syntax for object of inner class
		State.District sd=new State().new District();
	//calling inner class method
		sd.show();
	}

}
