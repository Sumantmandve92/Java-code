package b_objects;

//Interesting  object  creation and calling in another class
class Temp
{
    private Temp(int data)
    {
        System.out.printf(" Constructor called ");
    }
    protected static Temp create(int data)
    {
        Temp obj = new Temp(data);  //(2)create method creates an  object and initialize ,immediately  object call the constructor Temp
        return obj; //we return the object address 
    }
    public static int  myMethod()
    {
        System.out.printf(" Method called ");
        return 102;
    }
}
public class ClassAsReturnType {

	public static void main(String[] args) {
		
		Temp objtTemp= Temp.create(10);  //(1)call create method by its class ref. as the create method is static 
	
		objtTemp.myMethod();
		int roll=Temp.myMethod(); 
	}

}
