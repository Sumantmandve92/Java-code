package z_Collection;

import java.util.HashMap;
class MyNode<k,v>
{
	MyNode<k,v> nextNode;
	k key;
	v value;
	MyNode(k key, v value) {
		this.key=key;
		this.value=value;
	}
}
class MyHashMap<k,v>
{
	private MyNode[] a=new MyNode[16];
	//add()------------------------------------------------------------
	public void put(k key, v value) 
	{
		MyNode<k,v> link= new MyNode<>(key, value);
		int index=0;
		if(key!=null) 
		{
			index=(int)Math.abs(key.hashCode())%a.length;
		}
		if(a[index]==null) 
		{
			a[index]=link;
		}
		else 
		{
			MyNode temp=a[index];
			while(temp!=null) 
			{
				if((key==null && temp.key==key)||(key!=null && temp.key.equals(key)) )
				{
					temp.value=value;
					return ;
				}
				temp=temp.nextNode;
			}
			temp.nextNode=link;
		}
	}
	//replace()---------------------------------------------------------
	public void replace(k key,v value) 
	{
		int index=0;
		if(key!=null) 
		{
			index=(int)Math.abs(key.hashCode())%a.length;
		}
		MyNode temp=a[index];
		while (temp!=null)
		{
			if((key==null && temp.key==key)||(key!=null && temp.key.equals(key)) )
			{
				temp.value=value;
				return ;
			}
			
			temp=temp.nextNode;
		}
	}
	//remove()----------------------------------------------------------
	public void remove(k key) 
	{
		int index=0;
		if(key!=null) 
		{
			index=(int)Math.abs(key.hashCode())%a.length;
		}
		MyNode temp=a[index];
		if((key==null&& a[index].key==key)||(key!=null&& a[index].key.equals(key))) 
		{
			a[index]=temp.nextNode;
		}
		
		else {
			
			while (temp!=null)
			{
				if(temp.nextNode!=null) 
				{
					if((key==null&& temp.nextNode.key==key)||(key!=null&& temp.nextNode.key.equals(key)) ) 
					{
						temp.nextNode=temp.nextNode.nextNode;
					}
					
				}
				temp=temp.nextNode;

			}
		}
	}
	//get()-------------------------------------------------------------
	public Object get(k key) 
	{
		int index=0;
		if(key!=null) 
		{
			index=(int)Math.abs(key.hashCode())%a.length;
		}

		MyNode temp=a[index];
		while(temp!=null) 
		{
			if(temp.key==key) 
			{
				return temp.value;
			}
			temp=temp.nextNode;
		}

		return null;
	}
	//containskey()-----------------------------------------------------
	public boolean containsKey(k key) 
	{
		int index=0;
		if(key!=null) 
		{
			index=(int)Math.abs(key.hashCode())%a.length;
		}
		MyNode temp=a[index];
		while (temp!=null)
		{
			if(temp.key==key) 
			{
				return true;
			}
			temp=temp.nextNode;
		}
		return false;
	}
	//containsValue()---------------------------------------------------
	public boolean containsValue(v value) 
	{
		for (int i = 0; i < a.length; i++) 
		{
			MyNode temp=a[i];
			while (temp!=null)
			{
				if(temp.value==value) 
				{
					return true;
				}
				temp=temp.nextNode;

			}

		}
		return false;
	}
	//clone()-----------------------------------------------------------
	public MyHashMap clone() 
	{
		MyHashMap duplicate=new MyHashMap();
		for (int i = 0; i < a.length; i++) 
		{
			MyNode temp=a[i];
			while (temp!=null)
			{
				duplicate.put(temp.key,temp.value);
				temp=temp.nextNode;
			}
		}
		return duplicate;
	}
	//clear()-----------------------------------------------------------
	public void clear() 
	{
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=null;
		}
	}
	//isEmpty()---------------------------------------------------------
	public boolean isEmpty() 
	{
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]!=null) 
			{
				return false;
			}
		}
		return true;
	}
	//
	//entrySet()--------------------------------------------------------
	public void entrySet() 
	{

		
		
	}
	//putAll()----------------------------------------------------------
	public void putAll(MyHashMap list)
	{

		

	}
	//toString()--------------------------------------------------------
	public String toString() 
	{
		String s1="{";
		String s="";
		boolean flag=true;
		for (int i = 0; i < a.length; i++)
		{
			MyNode root= a[i];
			while(root!=null) 
			{
				s=s+root.key+"="+root.value+", ";
				flag=true;
				root=root.nextNode;
			}
			if(i==a.length-1 && flag) 
			{
				for (int j = 0; j < s.length()-2; j++)
				{
					s1=s1+s.charAt(j);
				}
			}
		}
		s1=s1+"}";
		return s1;
	}
}
class  Set
{

	
}
public class UserHashMap1 {
	public static void main(String[] args) {
		MyHashMap<Integer,String> map=new MyHashMap<>();
		map.put(null,"sumant");
		map.put(2,"sagar");
		map.put(3,"sumedh");
		map.put(1,"kkk");
		map.put(2,null);
		map.put(6, "ganesh");
		map.remove(5);
		map.replace(10, "pagal");
		MyHashMap newMap=map.clone();
		System.out.println(newMap);
		System.out.println( map.containsValue("kkk"));
		System.out.println(map.containsKey(null));
		//map.clear();
		System.out.println(map.get(null));
		System.out.println(map);
	}
}
