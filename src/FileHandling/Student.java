package FileHandling;

public class Student {

	int id;
	String name;
	int num;
	public Student(int id, String name, int num) {
		super();
		this.id = id;
		this.name = name;
		this.num = num;
	}
	@Override
	public String toString() {
		return id+","+name+","+num;
	}
	
}
