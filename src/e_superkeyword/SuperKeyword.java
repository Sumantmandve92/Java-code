package e_superkeyword;


class A1
{
    String s = "Class A";
    static 
    {
    	System.out.println("hi from A1 class");
    }
}
 
class B1 extends A1
{
    String s = "Class B";
 
    {
    	//this block will execute first when we enter into class
        System.out.println(super.s);
    }
    static {
    	
System.out.println("hi from class B");
    }
}
 
class C extends B1
{
    String s = "Class C";
 
    {
        System.out.println(super.s);
    }
    static 
    {
    	System.out.println("hi from class C");
    }
}
public class SuperKeyword {

	public static void main(String[] args) {
		
		C c=new C();
		System.out.println(c.s);

	}

}
