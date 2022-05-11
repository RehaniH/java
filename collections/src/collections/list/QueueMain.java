package collections.list;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		Queue<Float> queue = new PriorityQueue<>();
		queue.add(10.1f);
		queue.add(10.2f);
		queue.add(10.3f);
		queue.add(10.4f);
		
		//first in first out
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		queue.clear();
		System.out.println(queue.peek());
		System.out.println(queue.element());//does not remove but throws exception if the queue is empty
	}

}
