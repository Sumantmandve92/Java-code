package z_Collection;

import java.util.Arrays;

class Branch 
{
	 
	Object[] b;
	Branch nextBranch;
	public Branch(Object[] b) 
	{
		this.b=b;
	}
}
class Mylinkedlist
{
	private Branch rootBranch;
	private int index=0;
	
	public void add(Object num) 
	{
		if(rootBranch==null ||index>=5) 
		{
			grow();
		}
		Branch temp=rootBranch;
		while(temp!=null) 
		{
			if(temp.nextBranch==null) 
			{
				temp.b[index++]=num;
				
			}
			temp=temp.nextBranch;
		}
		
	}
	private void grow()
	{
		Object[] a=new Object[5];
		Branch link=new Branch(a);
		index=0;
		if(rootBranch==null) 
		{
			rootBranch=link;
		}
		else 
		{
			Branch temp=rootBranch;
			while(temp.nextBranch!=null) 
			{
				temp=temp.nextBranch;
			}
			temp.nextBranch=link;
		}
	}
	public String toString() 
	{
		String s="[";
		Branch temp=rootBranch;
		while(temp!=null) 
		{
			s=s+Arrays.toString(temp.b)+", ";
			temp=temp.nextBranch;
		}
		s=s+"]";
		return s;
	}
	
}
public class ListOfArray {

	public static void main(String[] args) {
		
		Mylinkedlist list=new Mylinkedlist();
		list.add("Shree");
		list.add("krushna");
		list.add("govind");
		list.add("hare");
		list.add("murari");
		list.add("hey");
		list.add("nath");
		list.add("narayan");
		list.add("vasudeva");
		list.add("wakratund");
		list.add("mahakaya");
		list.add("suryakoti");
		list.add("samprabh");
		list.add("nirvighnam");
		list.add("kurume");
		list.add("dev");
		list.add("sarva");
		list.add("karyeshu");
		list.add("sarwada");
		System.out.println(list);

	}

}
