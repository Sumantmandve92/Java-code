package z_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
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
	public int compareTo(Student s) {
		if(marks>s.marks) 
		{
			return 1;
		}
		else if(marks<s.marks) 
		{
			return -1;
		}
		else 
		{
			return name.compareTo(s.name);
			
		}
	} 
	public String toString() 
	
	{
		return "Student [id = "+id+", name = "+name+", marks = "+marks+"]";
	}
	

}
public class ObjectComparision {

	public static void main(String[] args) {


		List<Student> list=new ArrayList<>();
		list.add(new Student(1, "A", 90));
		list.add(new Student(2, "B", 90));
		list.add(new Student(3, "C", 85));
		list.add(new Student(4, "D", 95));
		Collections.sort(list);
		//sort method what will do is 
		for(Student s:list) 
		{
			System.out.println(s);
		}
	}

}
