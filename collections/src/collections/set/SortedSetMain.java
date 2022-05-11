package collections.set;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetMain {

	public static void main(String[] args) {
		SortedSet<String> sortedSet = new TreeSet<>();
		sortedSet.add("string a");
		sortedSet.add("string b");
		sortedSet.add("string c");
		sortedSet.add("string d");
		
		System.out.println(sortedSet);
		sortedSet.clear();
		
		//inserts according to ascending order
		sortedSet.add("banana");
		sortedSet.add("citrus");
		sortedSet.add("apple");
		
		System.out.println(sortedSet);
		//sortedSet.add("");
		
		TreeSet<String> set = (TreeSet<String>)sortedSet;
		NavigableSet<String> descendingSet = set.descendingSet();
		System.out.println(descendingSet);
		
		SortedSet<String> headSet = set.headSet("banana", true);
		System.out.println(headSet);
		
		descendingSet.add("pineapple");
		System.out.println(descendingSet);
		
		headSet.add("apricot");
		System.out.println(headSet);
	}

}
