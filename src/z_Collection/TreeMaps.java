package z_Collection;



import java.util.*;
import java.util.Map.Entry;


public class TreeMaps {

	public static void main(String[] args) {

		TreeMap<Integer, String>  map=new TreeMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		map.put(6, "F");
		map.
		//How iterate map=====================================================================
		//print map in set format
		System.out.println(map.entrySet());
		//dealing with each entry
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry);

		}
		//dealing with each value
		for (String value:map.values()) 
		{
			System.out.println(value);
		}
		//dealing with each key
		for (Integer key:map.keySet()) 
		{
			System.out.println(key);
		}
		//======================================================================================
	}


}


