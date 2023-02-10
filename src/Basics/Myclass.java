package Basics;

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bike bike1=new Bike();
bike1.company="Hero Honda";
Bike bike2=new Bike();
bike2.company="Yamaha";

bike2=bike1;//all elements of object bike1 is introduced in bike 2
bike1=bike2;//now we have bike 2 has bike1 elements and these bike1 elements are introduced again in bike
System.out.println(bike1.company);
System.out.println(bike2.company);
	}
	

}
class Bike
{
	String company;
}
