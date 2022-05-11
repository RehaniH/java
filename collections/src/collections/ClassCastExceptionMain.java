package collections;

import java.util.ArrayList;
import java.util.List;

public class ClassCastExceptionMain {

	public static void main(String[] args) {

		//usage of legacy code/ lack of generics
		List list = new ArrayList();
		list.add(1);
		list.add(1.1);
		
		List<Integer> list2 = list;
		
		for (Integer integer : list2) {
			System.out.println(integer);
		}
	}

}
