package z_Collection;

import java.util.*;
import java.util.Map.Entry;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Map.Entry;
//import java.util.SortedSet;
//import java.util.TreeMap;
import java.util.TreeSet;

public class Predefined_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		//tree map
//		TreeMap<Integer, String> tmap=new TreeMap<>();
//		tmap.put(10, "sumant");
//		tmap.put(111, "suman");
//		tmap.put(12, "suma");
//		tmap.put(1222, "sum");
//		tmap.put(14, "su");
//		tmap.put(155, null);
//		//tmap.clear();
//		//tmap.pollFirstEntry();
//		//tmap.pollLastEntry();
//		//tmap.replace(13, "jj");
//		//tmap.remove(155, "sum");
//		//tmap.put(14, "s");
//		//tmap.remove(155);
//		System.out.println(tmap.values());
//		System.out.println(tmap.tailMap(12, false));
//		System.out.println(tmap.tailMap(12));
//		System.out.println(tmap.subMap(11, true, 155, true));
//		System.out.println(tmap.subMap(11, 155));
//		System.out.println(tmap.size());
//		System.out.println(tmap.navigableKeySet());
//		System.out.println(tmap.lowerKey(12));
//		System.out.println(tmap.lowerEntry(155));
//		System.out.println(tmap.keySet());
//		System.out.println(tmap.isEmpty());
//	
//		for (Integer entry : tmap.navigableKeySet()) 
//		{
//		System.out.println(entry);	
//		}
//		System.out.println(tmap.higherEntry(14));
//		
//		System.out.println(tmap.hashCode());
//		System.out.println(tmap.get(111));
//		System.out.println(tmap.lastKey());
//		System.out.println(tmap.firstKey());
//	    System.out.println(	tmap.firstEntry());
//	    System.out.println(tmap.lastEntry());
//		System.out.println(tmap.entrySet());
//		System.out.println(tmap.descendingMap());
//		System.out.println(tmap.descendingKeySet());
//		System.out.println(tmap.containsValue("sum"));
//		System.out.println(tmap.containsKey(1));
//		System.out.println(tmap.clone());
//		System.out.println(tmap.ceilingKey(13));
//		System.out.println(tmap.ceilingEntry(16));
//		System.out.println(tmap);
//		System.out.println(tmap.higherKey(111));
//		System.out.println(tmap.headMap(14));
//		//tree set
		TreeSet<Integer> tSet= new TreeSet<>();
		tSet.add(2);
		tSet.add(5);

		tSet.add(9);

//		tSet.add("A");
//		tSet.add("B");
//		tSet.add("G");
//		tSet.add("H");
//		tSet.add("U");
//		tSet.add("I");
//		tSet.add("O");
	tSet.pollFirst();
	System.out.println(tSet);
		HashSet<String> hSet=new HashSet<>();
		hSet.add("A");
		hSet.add("B");
		hSet.add("C");
		hSet.add("D");
		hSet.add("E");
		hSet.add("F");
		hSet.add("G");
		for(Object s1:hSet.toArray()) 
		{
			System.out.println(s1);
		}
		System.out.println(Arrays.toString(hSet.toArray()));;
	for (String i : hSet) {
		System.out.println(tSet.contains(i));
	}
	System.out.println(	tSet.descendingSet()+"hi");
		
		tSet.containsAll(tSet);
//		System.out.println(tSet.ceiling(29));
//		System.out.println(tSet.headSet(20));
		HashMap<Integer , String> map=new HashMap<>();
		map.put(12, "46461416");
		map.put(45, "4646646416");
		map.put(46, "46451416");
		map.put(56, "4654261416");
		map.put(85, "8451561416");
		System.out.println(map.get(12)+"kkk");
		
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
			
		}
	}

}
