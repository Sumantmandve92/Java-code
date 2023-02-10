package b_objects;

public class ObjectAssign {

	public static void main(String[] args) {
		int count = 6;
        M m = new M(); m.print(--count);
        m.n = new N(); m.print(count--);
        m.n.o = new O(); m.print(--count);
        m.n.o.m = m; m.print(count--);
	}
}
class M {
    N n;
    void print(int count) {
        System.out.print("M" + count + " ");
        if (n != null && count > 0) n.print(count - 1);
    }
}
class N {
    O o;
    void print(int count) {
        System.out.print("N" + count + " ");
        if (o != null && count > 0) o.print(count - 1);
    }
}
class O {
    M m;
    void print(int count) {
        System.out.print("O" + count + " ");
        if (m != null && count > 0) m.print(count - 1);
    }
}