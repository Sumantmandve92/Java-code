package z_Collection;

class MyNode1<k,v>
{
	k key;
	v value;
	MyNode1<k,v> redNext;//for linkedlist
	MyNode1<k,v> blueNext;//for hashmap
	public MyNode1(k key,v value) {
		this.key=key;
		this.value=value;
	}
}
class MyLinkedHashMap<k,v>
{
	MyNode1<k,v>[] a=new MyNode1[16];//array for hash map
	MyNode1<k,v> root;// root for linked list
	//put()/ add()-------------------------------------------------------------
	public void put(k key, v value) 
	{
		MyNode1<k,v> link= new MyNode1<>(key,value);
		int index=0;
		if(key!=null) 
		{
			index=(int)Math.abs(key.hashCode())%a.length;
		}
		boolean flag=true;
		if(a[index]==null) 
		{
			a[index]=link;
		}
		else 
		{
			MyNode1<k,v> temp= a[index];
			while(temp!=null) 
			{
				if((key==null&& temp.key==key)|| (key!=null&& temp.key.equals(key)) ) 
				{
					temp.value=value;
					flag=false;
				}
				temp=temp.blueNext;
			}
			if(flag) 
			{
				temp.blueNext=link;
			}
		}
		if(root==null) 
		{
			root=link;
		}
		else 
		{
			MyNode1<k,v> temp=root;
			while(temp.redNext!=null) 
			{
				temp=temp.redNext;
			}
			if(flag) 
			{
				temp.redNext=link;
			}
		}
	}
	//get()---------------------------------------------------------------
	public Object getValue(k key) 
	{
		int index=0;
		if(key!=null) 
		{
			index=(int)Math.abs(key.hashCode())%a.length;
		}
		MyNode1 temp=a[index];
		while(temp!=null) 
		{
			if((key==null&& temp.key==key)|| (key!=null&& temp.key.equals(key)) ) 
			{
				return temp.value;
			}
			temp=temp.blueNext;
		}
		return null;
	}
	//replace()-----------------------------------------------------------
	public void replace(k key, v value) 
	{
		int index=0;
		if(key!=null) 
		{
			index=(int)Math.abs(key.hashCode())%a.length;
		}
		MyNode1 temp=a[index];
		while(temp!=null) 
		{
			if((key==null&& temp.key==key)|| (key!=null&& temp.key.equals(key)) ) 
			{
				temp.value=value;
			}
			temp=temp.blueNext;
		}
		temp=root;
		while(temp!=null) 
		{
			if((key==null&& temp.key==key)|| (key!=null&& temp.key.equals(key)) ) 
			{
				temp.value=value;
			}
			temp=temp.redNext;
		}
	}
	//remove()------------------------------------------------------------
	public void remove(k key) 
	{
		int index=0;
		if(key!=null) 
		{
			index=(int)Math.abs(key.hashCode())%a.length;
		}
		MyNode1 temp=a[index];
		if((key==null&& a[index].key==key)||(key!=null&& a[index].key.equals(key))) 
		{
			a[index]=temp.blueNext;
		}
		else {
			
			while (temp!=null)
			{
				if(temp.blueNext!=null) 
				{
					if((key==null&& temp.blueNext.key==key)||(key!=null&& temp.blueNext.key.equals(key)) ) 
					{
						temp.blueNext=temp.blueNext.blueNext;
					}
				}
				temp=temp.blueNext;
			}
		}
		temp=root;
		if((key==null&& temp.key==key)||(key!=null&& temp.key.equals(key))) 
		{
			root=temp.redNext;
		}
		else {
			
			while (temp!=null)
			{
				if(temp.redNext!=null) 
				{
					if((key==null&& temp.redNext.key==key)||(key!=null&& temp.redNext.key.equals(key)) ) 
					{
						temp.redNext=temp.redNext.redNext;
					}
				}
				temp=temp.redNext;
			}
		}	
	}
	//clone()-------------------------------------------------------------
	public MyLinkedHashMap clone() 
	{
		MyLinkedHashMap duplicate=new MyLinkedHashMap();
		MyNode1<k,v> temp=root;
		while(temp!=null) 
		{
			duplicate.put(temp.key, temp.value);
			temp=temp.redNext;
		}
		return duplicate;
		
	}
	
	//isEmpty()-----------------------------------------------------------
	public boolean isEmpty() 
	{
		if(root==null) 
			return true;
		else 
			return false;
	}
	//size()--------------------------------------------------------------
	public int size() 
	{
		int index=0;
		MyNode1 temp=root;
		while(temp!=null) 
		{
			index++;
			temp=temp.redNext;
		}
		if(index<Integer.MAX_VALUE)
			return index;
		else 
			return Integer.MAX_VALUE;
	}
	
	//entrySet()----------------------------------------------------------
	//containsKey()-------------------------------------------------------
	//containsValue()-----------------------------------------------------
	//keySet()------------------------------------------------------------
	// toString()-------------------------------------------------------------------
	public String toString() 
	{
		String s1="{";

		MyNode1 temp=root;
		while(temp!=null) 
		{
			if(temp.redNext!=null) 
			{
				s1=s1+temp.key+" = "+temp.value+", ";
			}
			else 
			{
				s1=s1+temp.key+" = "+temp.value;
			}
			temp=temp.redNext;
		}
		s1=s1+"}";
		return s1;
	}


}
public class UserLinkedHashMap {

	public static void main(String[] args) {

		//maintain insertion order and no duplicate key allowed
		MyLinkedHashMap<Integer,String> map=new MyLinkedHashMap();
		map.put(null,"A");
		map.put(2,"B");
		map.put(3,"C");
		map.put(3,"D");
		map.put(5,"E");
		map.put(6,null);
		map.replace(null, "N");
		map.remove(null);
		
		System.out.println(map.clone());
		System.out.println(map);
	}

}
