package z_Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		list.add("H");
		list.add("I");
		list.add("J");
		list.add("K");
		ListIterator i=list.listIterator();
		i.next();//A
		i.next();//B
		i.next();//C
		i.next();//D
		i.next();//E
		i.next();//F
	
		System.out.println(list+"1");
		i.remove();//remove F
		System.out.println(list+"2");
	System.out.println(i.previous());
		System.out.println(list+"3");
		System.out.println(i.previous());
		System.out.println(list+"4");
		
		System.out.println(i.next());
		System.out.println(list+"5");
		i.remove();
		System.out.println(list+"6");
		System.out.println(i.previous());
		System.out.println(list+"7");
		System.out.println(i.next());
		System.out.println(list+"8");
	System.out.println(i.previous());
		System.out.println(list+"9");
		i.remove();
		System.out.println(list+"10");
//		System.out.println(i.next());//A
//		System.out.println(i.next());//B
//		System.out.println(i.next());//C
//		System.out.println(i.previous());//C
//		System.out.println();
//		i.remove();
//		System.out.println(i.next());//C
//		System.out.println(i.next());//D
//		i.remove();
//		System.out.println(i.next());//E
//		System.out.println(i.next());//F
//		System.out.println(i.next());
//		

	}

}
