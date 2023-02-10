package b_objects;



class Student{
	
	String name;
	int id;
	
	Address address;

	Student(String name,int id,Address address) {
     this.name = name;
     this.id = id;
     this.address = address;
	}
	
	void display()
	{
		
		address.m1();
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
		System.out.println("FlatNo: "+address.flatNo);
		System.out.println("City: "+address.city);
		System.out.println("State: "+address.state);
		System.out.println("colony : "+address.colony);
		
	}
}

class Address
{
	String colony="Mitra";
	int flatNo;
	String city,state;
	
	Address(int flatNo,String city,String state)
	{
		this.flatNo = flatNo;
		this.city = city;
		this.state = state;
	}
	
	void m1()
	{
		System.out.println("hii");
	}
	
}


public class ContainmentOfObject {

	public static void main(String[] args) {
		/*Address address=new Address(503,"Pune","MH")
		 * Student stu1 = new Student("Rahul", 101,address);
		 * ..........OR.......................
		 * */
		Student stu1 = new Student("Rahul", 101, new Address(503, "Pune", "MH"));
		stu1.display();
	}

}
