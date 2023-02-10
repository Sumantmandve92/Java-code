package h_array;

class Student {
	int rollNo;
	String name;
	int marks;

	Student(int rollNo, String name, int marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}

}

public class ArrayOfObject {
	public static void main(String[] args) {
		
		Student s1=new Student(1, "Mahesh", 89);
		Student s2=new Student(2, "Narayan", 75);
		Student s3=new Student(3, "Suresh", 95);
		Student s4=new Student(4, "Dinesh", 65);
		Student s5=new Student(5, "Ganesh", 89);
		
		
		//create an array having data as objects.
		Student[] std= {s1,s2,s3,s4,s5};
		
		//sort this array on the basis of student marks
		
		for(int i=0;i<std.length;i++) 
		{
			for(int j=i+1;j<std.length;j++) 
			{
			if(std[i].marks>std[j].marks) 
			{
				Student temp=std[i];
				std[i]=std[j];
				std[j]=temp;
			}
				
			}
		}
		for(Student i:std) 
		{
			System.out.println(i.rollNo+" "+i.name+" "+i.marks);
		}
	}

}
