package z_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student 
{

	int id;
	String name;
	int marks;
	public Student(int id,String name,int marks) {

		this.id=id;
		this.name=name;
		this.marks=marks;
		}
	@Override

	public String toString() 
	
	{
		return "Student [id = "+id+", name = "+name+", marks = "+marks+"]";
	}
	
}
class Staff implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		
		if(s1.marks>s2.marks) 
		{
			return 1;
		}
		else if(s1.marks<s2.marks) 
		{
			return -1;
		}
		else 
		{
			return s1.name.compareTo(s2.name);
			
		}
	}
	
	}
public class ObjectComaparisionByComparator {

	public static void main(String[] args) {
		

		List<Student> list=new ArrayList<>();
		list.add(new Student(1, "A", 90));
		list.add(new Student(2, "B", 90));
		list.add(new Student(3, "C", 85));
		list.add(new Student(4, "D", 95));
		
		Collections.sort(list, new Staff());
		for(Student s:list) 
		{
			System.out.println(s);
		}

	}

}
