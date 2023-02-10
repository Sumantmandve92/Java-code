package b_methods;

public class BinaryConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Convert dec=new Convert();
dec.printBinaryFormat(8489);
	}

}
class Convert {

    public void printBinaryFormat(int dec) {
        int bin[] = new int[15];
        int temp = 0;
        while (dec > 0) {
            bin[temp++] = dec % 2;
            dec = dec / 2;
        }
        System.out.print("After binary conversion: ");
        for (int i = temp - 1; i >= 0; i--) {
            System.out.print(bin[i]);
        }
    }
}
