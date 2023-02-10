package c_constructors;

public class PrivateConstructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Docomo();
        System.out.println(Docomo.str);
	}
}

class Mobile {
    static String str = "";
    protected Mobile() {
        str += "Mobile is : ";
    }
}
class Airtel extends Mobile {
    private Airtel() {
        str += "Airtel";
    }
}
class Docomo extends Mobile {
    Docomo() {
        str += "Docomo";
    }
    
}