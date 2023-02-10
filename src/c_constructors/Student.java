package c_constructors;

public class Student {
	 int  age=3.141;
	String name="";
	 Student(int age,String name) 
	 {
		this.name=name;
		this.age=age;
	}
	 void setName() 
	 {
		 System.out.println(age+" "+name);
	 }
	public static void main(String[] args) 
	{
		
		Student std=new Student(23, "John");
		std.setName();
	}

}

