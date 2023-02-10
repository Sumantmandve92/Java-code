package FileHandling;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) throws Exception {

		Scanner sc=new Scanner(System.in);
		MyController obj=new MyController();

		while(true) 
		{
			System.out.println("Enter what you want to do(click button):(1=add or 2=update or 3=read or 4=delete or 5=exit):\n");

			int n=sc.nextInt();
			switch (n) 
			{

			case (1):
			{
				System.out.println("enter student id :");
				int id=sc.nextInt();
				System.out.println("student name  :");
				sc.nextLine();
				String name=sc.nextLine();
				System.out.println("student marks");
				int marks=sc.nextInt();
				Student s1=new Student(id, name, marks);
				obj.add(s1);
				break;
			}
			case (2): 
			{
				System.err.println("enter student id :");
				int id=sc.nextInt();
				System.out.println("student name  :");
				sc.nextLine();
				String name=sc.nextLine();
				obj.update(id, name);
				break;
			}
			case (3): 
			{
				obj.read();
				break;
			}
			case (4): 
			{
				System.out.println("Enter student id which you want to delete :");
				int id=sc.nextInt();
				obj.delete(id);
				break;
			}
		
			}
			System.out.println("enter operation number");
			n=sc.nextInt();
			if(n>4) 
			{
				break;
			}

		}
		System.out.println("you exit ......!!");
	}

}
