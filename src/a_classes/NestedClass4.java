package a_classes;

public class NestedClass4 {

	public static void main(String[] args) {
		Outer1 o = new Outer1();//1
        o.side();//3
	}
}

class Outer1 
{
   
    public void side() //
    {
        Inner1 i1 = new Inner1();//4
        i1.side();//8
        System.out.print("-Main-");
    }
    public Outer1() //2,7,12
    {
    }
    class Inner1 extends Outer1 
    {
        public Inner1() //5
        {
            super();//6
        }
        public void side() 
        {
            Inner2 i2 = new Inner2();//9
            i2.side();//13
            System.out.print("-Inner1-");
        }
    }
    public class Inner2 extends Inner1 
    {
        public Inner2() //10
        {
            Outer1.this.super();//11
        }
        public void side() //14
        {
            System.out.print("-Inner2-");
        }
    }
}