package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapMain {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> cacheMap = new LinkedHashMap<>();
		cacheMap.put( 4, "D");
		cacheMap.put( 1, "A");
		cacheMap.put( 5, "E");
		cacheMap.put( 3, "C");
		cacheMap.put( 2, "B");
		System.out.println(cacheMap);
		
		cacheMap.get(1);
		cacheMap.get(3);
		cacheMap.get(5);
		System.out.println(cacheMap.get(5));
		System.out.println(cacheMap);
		
		Set<Entry<Integer, String>> entrySet = cacheMap.entrySet();
		
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		
		while(iterator.hasNext()) {
			Entry<Integer, String> next = iterator.next();
			System.out.println(next.getKey() + ": " + next.getValue());
		}
	}

}
