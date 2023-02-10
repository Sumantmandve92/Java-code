package c_constructors;


class U {
    V v = new V();

    U() { System.out.print("U"); }

    U(int i) { System.out.print("u");}
}

class V {
    V() { System.out.print("V"); }

    V(int i) { System.out.print("v"); }
}

class T extends V {

    T() { System.out.print("T"); }

    T(int i) { System.out.print("t"); }
}

public class DefaultConstructor1 {
	public static void main(String[] args) 
	{
		//cons19
		
		  U u = new U();   //VU
	        U u1 = new U(1);//Vu
	        V v = new V();//V
	        V v1 = new V(1);//v
	        T t = new T();//VT
	        T t1 = new T(1);//Vt
	}

	
	

}
