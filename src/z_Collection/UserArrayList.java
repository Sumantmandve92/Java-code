package z_Collection;

class MyArraylist
{

	private int[] a=new int[5];
	private int index=0;
	//add(add at last) method--------------------------------------------------
	public void add(int num) 
	{
		if(index==a.length) 
		{
			grow();
		}
		a[index++]=num;
		
	}
	//add(index,num)-----------------------------------------------------------
	public void add(int i,int num) 
	{
		if(i<0 ||i>index) 
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		if(index==a.length) 
		{
			grow();
		}
		for (int j = index; j >i; j--) 
		{
			a[j]=a[j-1];
		}
		a[i]=num;
		index++;
	}
	//set(index,num)replace--------------------------------------------------------
	public void set(int i,int num) 
	{
		a[i]=num;
	}
	//get(int i)--------------------------------------------------------------------
	public int get(int i) 
	{
		if(i<0 && i>=index) 
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		return a[i];
	}
	//remove()---------------------------------------------------------------------
	public void remove(int i) 
	{
		
	} 
	//grow()-----------------------------------------------------------------------
	private void grow() {
		
		int[] b=new int[a.length+10];
		for (int i = 0; i < a.length; i++) 
		{
			b[i]=a[i];
			
		}
		a=b;
	}

	public String toString() 
	{
		String string="[";
		for(int i=0;i<index;i++) 
		{
			if(i<index-1) 
			{
				string=string+a[i]+", ";
			}
			else 
			{
				string=string+a[i];
			}
		}
		string=string+"]";
		return string;
	} 
}

public class UserArrayList {

	public static void main(String[] args) {
		
		MyArraylist list=new MyArraylist();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(10);
		list.add(1,99);
		list.set(4, 0);
		
		MyArraylist list1=new MyArraylist();
		

		System.out.println(list);
		System.out.println(list.get(5));
	}

}
