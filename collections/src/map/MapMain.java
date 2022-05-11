package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		//gets updated
		map.put("four", 5);
		
		map.put(null, 5);
		map.put(null, 6);
		
		System.out.println(map);
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		map.put("some", 10);
		
		for (Map.Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("key: " + key + " value: " + val) ;
			
		}
	}

}
