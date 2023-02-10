package f_abstraction;

abstract class Animal
{
	abstract Animal pray();
}
class Cat extends Animal
{

	@Override
	Cat pray() {
		// TODO Auto-generated method stub
		return this;
	}
	
}
class Rabbit extends Animal
{

	@Override
	Animal pray() {
		// TODO Auto-generated method stub
		return this;
	}
	
}
public class GetClassMethod {

	public static void main(String[] args) {
		
		System.out.println(new Cat().getClass().getSimpleName());
		System.out.println(new Rabbit().getClass().getSimpleName());

	}

}
