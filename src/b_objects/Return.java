package b_objects;

public class Return {

	public static void main(String[] args) {
System.out.print(PhoneRings.call(53) + " " + PhoneRings.call(25));
		
	}	
}

class PhoneRings {

    public static int call(int number) {
        System.out.print(number + ":");
        if (number % 7 == 0) {
            return 77;
        }
        if (number % 6 == 0) {
            return 66;
        }
        return call(number - 1);
    }
}