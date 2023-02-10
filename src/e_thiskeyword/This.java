package e_thiskeyword;

import java.util.*;
public class  This
{
	public static void main(String[] args) 
	{
		//const.23
		new A().print();
        new A(15).print();
        new A('A').print();
        new A(15, 34.5).print();
        new A(16, 16.0, 16.0f).print(); 
		
	}	
}

class A {
    int i = 20;
    double j = 35.6;
    float k = 121.3f;
    char c = 'C';

	A() {
	}

	A(int i) {
		this.i = i;
	}

	A(int i, double j) {
		this(i);
		this.j = j;
	}

	A(int i, double j, float k) {
		this((int) j, i);
		this.k = k;
	}

	A(char c) {
		this(c, c);
		k = c;
		this.c = c;
	}
    public void print() {
        System.out.print("[" + i + "," + j + "," + k + "," + c + "]");
    }
}

