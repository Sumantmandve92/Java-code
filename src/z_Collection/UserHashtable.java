package z_Collection;
import java.util.*;
import java.lang.*;
class TableNode<Integer,String>
{
	Integer key;
	String value;
	TableNode<Integer ,String> next;
	public TableNode(Integer data ,String value) 
	{
		this.key=data;
		this.value=value;
	}
	
}
class MyHashTable<Integer,String>
{
	TableNode[] roots=new TableNode[5];
	
	public void add(Integer key,String value)
	{
	
		//get index of root in roots on the basis of reminder
		int index=(int)key%roots.length;
		System.out.println(index);
		//get  i'th root of roots in which key-value pair we have to add 
		TableNode root=roots[index];
		////create object of key-value pair
		TableNode<Integer,String> link=new TableNode<>(key,value);
		if(root==null) 
		{
			//add first pair
		roots[index]=link;
		}
		else 
		{
			//add upcoming pairs
			while(root.next!=null) 
			{
				root=root.next;
			}
			root.next=link;
		}
	}
	public java.lang.String toString() 
	{
		java.lang.String string="[";
		for (int i = 0; i < roots.length; i++) 
		{
			TableNode root=roots[i];
			while(root!=null)
			{
				
				string=string+root.key+" "+root.value+", ";
			root=root.next;
				
			}
			
		}
		string=string+"]";
		
		
		
		
		return string;
	}
	
	
}
public class UserHashtable {

	public static void main(String[] args) {
		
		MyHashTable<Integer,String> table=new MyHashTable<>();
		table.add(20,"I");
		table.add(21,"am");
		table.add(22,"super");
		table.add(23,"man");
	

		System.out.println(table);
	
		
		
	}

}
