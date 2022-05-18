package map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapMain {

	public static void main(String[] args) {

		SortedMap<Integer, Integer> sortedMap = new TreeMap<>();
		sortedMap.put(1, 10);
		sortedMap.put(4, 40);
		sortedMap.put(3, 30);
		sortedMap.put(5, 50);
		sortedMap.put(2, 20);
		sortedMap.put(2, 200);
		//sortedMap.put(6, null); not allowed
		//sortedMap.put(null, 20); not allowed
		
		
		//arranges in ascending order
		System.out.println(sortedMap);
		
		
	}

}
