package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LinkedListMain {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("new");
		linkedList.add("one");
		linkedList.add("two");
		linkedList.add("three");
		
		System.out.println(linkedList);
		
		List<String> list = new ArrayList<>();
		list.add("new");
		list.add("one");
		list.add("two");
		list.add("three");
		
		Set<String> set = new TreeSet<>();
		set.add("new");
		set.add("one");
		set.add("two");
		set.add("three");
		
		System.out.println(linkedList.contains("one"));
		System.out.println(linkedList.containsAll(list));
		System.out.println(linkedList.containsAll(set));
		System.out.println(linkedList.poll());
		System.out.println(linkedList);
		System.out.println(linkedList.peek());
		System.out.println(linkedList);
		
		for (String string : linkedList) {
			System.out.println(string);
		}
	}

}
