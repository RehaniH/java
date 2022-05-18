package collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMain {

	public static void main(String[] args) {
		
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("one");
		linkedHashSet.add("two");
		linkedHashSet.add("three");
		linkedHashSet.add("four");
		
		//maintains insertion order
		System.out.println(linkedHashSet);
		
		Iterator<String> iterator = linkedHashSet.iterator();
		
		//generates exception. Therefore, it is not synchronized.
		linkedHashSet.add("five");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
