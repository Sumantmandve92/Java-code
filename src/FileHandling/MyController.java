package FileHandling;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class MyController {
	String data;
	//add Student==================================================================================
	public  void add(Student student) throws Exception {
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\ADMIN\\Desktop\\StudentData\\data.txt"));
		
		while(true) 
		{
			String s1=br.readLine();
			if(s1==null) 
			{
				break;
			}
			data+=s1+"\n";
		}
		data+=student;
		FileWriter writer=new FileWriter("C:\\Users\\ADMIN\\Desktop\\StudentData\\data.txt");
		writer.append(data);
		data="";
		writer.flush();
		writer.close();	
	}
	//update Student data=================================================================================
	public void update(int studentId,String name) throws Exception {
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\ADMIN\\Desktop\\StudentData\\data.txt"));		
		while(true) 
		{
			String s1=br.readLine();
			if(s1==null) 
			{
				break;
			}
			if(s1.startsWith(studentId+"")) 
			{
				String[] s2=s1.split(",");
				s2[1]=name;
				s1=s2[0]+","+s2[1]+","+s2[2];
			}
			data+=s1+"\n";
		}
		FileWriter f=new FileWriter("C:\\Users\\ADMIN\\Desktop\\StudentData\\data.txt");
		f.append(data);
		data="";
		f.flush();
		f.close();
	}
	//Read All Students=======================================================================
	public void read() throws Exception 
	{
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\ADMIN\\Desktop\\StudentData\\data.txt"));

		while(true) 
		{
			String s1=br.readLine();
			if(s1==null) 
			{
				break;
			}
			System.out.println(s1);
		}
	}
	//delete Student=================================================================================
	public void delete(int stdId) throws Exception {
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\ADMIN\\Desktop\\StudentData\\data.txt"));
		while(true) 
		{
			String s1=br.readLine();
			if(s1==null) 
			{
				break;
			}
			if(s1.startsWith(stdId+"")) 
			{
				continue;
			}

			data+=s1+"\n";	
		}
		FileWriter f=new FileWriter("C:\\Users\\ADMIN\\Desktop\\StudentData\\data.txt");
		f.append(data);
		data="";
		f.flush();
		f.close();
	}

}
