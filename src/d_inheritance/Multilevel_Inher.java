package d_inheritance;

class Test1 {
	void demo() {
		System.out.println("Test1");
	}
}

class Test2 extends Test1 {
	void demo() {
		System.out.println("Test2");
	}
}

class Test3 extends Test2 {
	void demo() {
		System.out.println("Test3");
	}

}

class Test4 extends Test3 {
	void demo() {
		System.out.println("Test4");
	}

}

public class Multilevel_Inher {
public static void main(String[] args) {
	Test3 ob =new Test4();
	ob.demo();
}
}
