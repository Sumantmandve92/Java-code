package f_abstraction;
//Abstraction by using 'abstract' keyword
//for abstraction we need 'polymorphism'  and 'inheritance'
abstract  class General 
{

	abstract  void test();//abstract method
	
	  void normal()  //non abstract method
	{
		System.out.println("Normal method");
	}

}
class Normal extends General
{
	void test() //defining abstract method
	{
		System.out.println("abstract method defined");
	}
}
public class Abstraction
{ 	/*:now here no abstract method defined and not extends Abstraction class
	 *:so if  we want to call non-abstract method from abstract class 
	 *:option(1) :: we should create object of Abstraction class but this option is denied becoz we can not create an object of abstract class
	 *@anywhere in the program
	 *option(2):: we should make that non-abstract method as static,then we can call that method everywhere without using object 
	 */
	public static void main(String[] args)
	{
	
	Normal general = new Normal();
	general.normal();
		
	}
	
}
