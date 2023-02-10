package b_objects;



public class Demo {

	public static void main(String[] args) 
	{
		Father ob1=new Father();
		ob1.i=21;
		Son ob2=new Son();// we can assign value of i and j by using ob2
		ob2.j=55;
		ob2.i=20;// if we not assign any value to i by using ob2 .means in i value is its default(0) or value that assigned during declaration(3)
		
		printI(ob1);
		printI(ob2);
		printJ(ob2);
		//printJ(ob1);
		
	

	}
	public static void printI(Father x) 
	{
		System.out.println(x.i);
	}
	public static void printJ(Son y ) // we cant pass ob1 as args. because wecant access the prop by using object of father with son as ref.
	{
		System.out.println(y.j);
	}

}
class Father
{
	int i;
	//int i=3
}
class Son extends Father
{
	int j;
}
