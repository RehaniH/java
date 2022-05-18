package map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableMain {

	public static void main(String[] args) {

		Map<Integer, String> hashtable = new Hashtable<>();
		hashtable.put(1, "one");
		hashtable.put(2, "two");
		hashtable.put(3, "three");
		hashtable.put(4, "four");
		//NullPointer Exception in here
		//hashtable.put(5, null);
		//NullPointer: cannot invoke hashCode() in here
		//hashtable.put(null, "four");
		System.out.println(hashtable);
		
		Map<String, Integer> hashtable2 = new Hashtable<>();
		hashtable2.put("one", 1);
		hashtable2.put("two", 2);
		hashtable2.put("three", 3);
		hashtable2.put("four", 4);
		System.out.println(hashtable2);
		

	}

}
