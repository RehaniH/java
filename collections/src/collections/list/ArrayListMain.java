package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListMain {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Shane");
		list.add("Ranul");
		list.add("Andrew");
		list.add("Sudana");//can contain duplicate elements and null values
		list.add("Sudana");
		list.add(null);
		list.add(null);
		
		System.out.println(list);
		
		System.out.println("contains: " + list.contains("Sudana"));
		System.out.println("get index: " + list.indexOf("Sudana"));
		System.out.println("get last index: " + list.lastIndexOf("Sudana"));
		list.set(3, "Himasha");//override/ update the element
		System.out.println("set Himasha to index 3: " + list);
		List<String> subList = list.subList(0, 4); //4 is excluded
		System.out.println("sublist from 0 to 4: " + subList);
		System.out.println("contains: " + list.contains(new String("Sudana")));
		System.out.println("remove: " + list.remove(1));
		System.out.println(list);
		System.out.println("get: " + list.get(0));
		list.clear();
		System.out.println("get: " + list.indexOf("Sudana"));
		System.out.println("clear: "  + list.isEmpty());
		
		list.add(0, "Ranul");
		list.add(1, "Shane");
		list.add(1, "Andrew");
		System.out.println(list);
		
		ListIterator<String> listIterator = list.listIterator(1);
		
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");
		}
		System.out.println();
		Collections.sort(list);
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
			iterator.remove();//can be used only after next
			System.out.println(list);
		}
		
	}

}
