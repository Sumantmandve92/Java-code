package z_Collection;


class Node<dataType>
{

	dataType data;
	Node<dataType> nextNode;
	public Node(dataType data) 
	{

		this.data=data;
		nextNode=null;


	}
}
class MyLinkedList<dataType> {


	//implementation of all methods in linked list
	Node<dataType> rootNode=null;
	//add();---------------------------------------------------------
	void add(dataType num) 
	{
		Node<dataType> nextNode=new Node(num);
		if(rootNode==null) 
		{
			rootNode=nextNode;
		}
		else 
		{
			Node<dataType> temp=rootNode;
			while(temp.nextNode!=null) 
			{
				temp=temp.nextNode;
			}
			temp.nextNode=nextNode;
		}
	}
	//add at given index-----------------------------------------------
	void add(int i,dataType value) 
	{
		Node<dataType> temp=rootNode;
		Node<dataType> newObj=new Node(value);
		
		if(i<0) 
		{
			throw new IndexOutOfBoundsException();
		}
		int j=0;
		if(temp==null) 
		{
			rootNode=newObj;
		}
		if(i==0) 
		{
			newObj.nextNode=rootNode;
			rootNode=newObj;
		}
		else {
			boolean added=true;
			
				while(temp!=null) 
				{
					if(i-1==j) 
					{
	
						newObj.nextNode=temp.nextNode;
						temp.nextNode=newObj;
						added=false;
						break;
					}
					j++;
					temp=temp.nextNode;
				}
				if(added) 
				{
					throw new IndexOutOfBoundsException();
				}
			}

	}
	//indexOf();-------------------------------------------------------
	int indexOf(dataType num) 
	{
		Node<dataType> temp=rootNode;
		int i=0;
		while(temp!=null) 
		{
			if(temp.data==num) 
			{
				return i;
			}
			temp=temp.nextNode;
			i++;
		}
		return -1;
	}
	//contains();------------------------------------------------------
	boolean contains(dataType num) 
	{
		Node<dataType> temp=rootNode;
		while(temp.nextNode!=null) 
		{

			if(temp.data==num) 
			{
				return true;
			}
			temp=temp.nextNode;
		}
		return false;
	}
	//set(i,num);-----------------------------------------------------
	void set(int i,dataType value) 
	{
		Node<dataType> newObj=new Node(value);
		Node<dataType> temp=rootNode;
		int j=0;
		if(i<0) 
		{
			throw new IndexOutOfBoundsException();
		}
		boolean added=false;
		if(i==0) 
		{
			newObj.nextNode=temp.nextNode;
			rootNode =newObj;
			added=true;
		}
		else {
			while(temp!=null) 
			{
				if(j==i-1) 
				{
					newObj.nextNode =temp.nextNode.nextNode;
					temp.nextNode=newObj;
					added=true;
					break;
				}
				j++;
				temp=temp.nextNode;
				
			}
		}
		if(added==false) 
		{
			throw new IndexOutOfBoundsException();
		}
	}
	//get(); get value at given index

	dataType get(int i) 
	{
		Node<dataType> temp=rootNode;
	
		int cnt=0;
		while(temp.nextNode!=null) 
		{
			if(i==cnt) 
			{
			break;
			}
			cnt++;
			temp=temp.nextNode;
		}
		if(i<0 ||cnt>i) 
		{
			throw new IndexOutOfBoundsException();
		}
		return temp.data;
		
	}
	//clear();--------------------------------------------------
	void clear() 
	{
		rootNode=null;
	}
	//isEmpty();---------------------------------------------------
	boolean isEmpty() 
	{
		if(rootNode!=null) 
		{
			return false;
		}
		else 
		{
			return true;
		}
	} 
	//.size()-------------------------------------------------------
	int size() 
	{
		Node<dataType> temp=rootNode;
		int index=0;
		while(temp!=null) 
		{
			index++;
			temp=temp.nextNode;
		}
		return index;
	}
	//.clone();-----------------------------------------------------
//	Object clone() 
//	{
//		
//	}
	//toString() method================================================
	public String toString() 
	{
		String string="[";
		Node<dataType> tempNode=rootNode;
		while(tempNode!=null) 
		{
			if(tempNode.nextNode!=null) 
			{
				string=string+tempNode.data+", ";
			}
			else 
			{
				string=string+tempNode.data;
			}
			tempNode=tempNode.nextNode;
		}
		string=string+"]";
		return string;
	}

}
public class UserLinkedList
{
	public static void main(String[] args) {
		MyLinkedList<Integer> list=new MyLinkedList<>();
		list.add(10);
		list.add(12);
		list.add(12);
		list.add(12);
		list.add(12);
		list.add(1, 50);
		list.set(5, 99);
		list.get(1);
		//list.clear();
		//System.out.println(list.isEmpty());
		//System.out.println(list.size());
		
		
		
		//System.out.println(list.indexOf(99));
		//System.out.println(list.contains(12));
		System.out.println(list);
	}
}
