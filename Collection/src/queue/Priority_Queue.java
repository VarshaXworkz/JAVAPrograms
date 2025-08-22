package queue;

import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class Priority_Queue {
	public static void main(String[] args) {
		Queue<String> queue=new PriorityQueue();
		queue.offer("Anu");
		queue.offer("Bhanu");
		queue.offer("Tanu");
		queue.offer("Manu");
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue);
		
		//sSystem.out.println(queue);
		
	}

}
