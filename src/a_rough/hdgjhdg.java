package a_rough;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

import javax.naming.ldap.SortControl;

class base {
	public base() {
		System.out.println("hi");
	}

	public void m1() {

	}
}

class der extends base {
	int a;

	public der() {
	}

	public der(int i) {
	}

	public void m1() {

	}

}

public class hdgjhdg {
	public static void main(String[] args) {

		base b = new der();
//		b.m1();

//		der d=new der();
//		d.m1();
//		der m=new der();
//		m.m1();

	}

}
