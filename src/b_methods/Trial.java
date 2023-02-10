package b_methods;

public class Trial {

	public static void main(String[] args) {
	
		Krish krish = new Krish();
        System.out.print(krish.c + " ");
        krish.krish(krish.c);
        //krish.c=71;
        System.out.println(krish.c);
        
	}
	
}

class Krish {
    static char c = 70;
  
     void krish(char c) {
        int cr = c;
        cr = cr * 2;
        cr = cr + c - 20;
        this.c = (char) cr;
    }
}