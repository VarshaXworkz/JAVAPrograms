package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_Class {
	public static void main(String[] args) {
		Deque<String> deque=new ArrayDeque<>();
		deque.add("Tanu");
		deque.add("Manu");
		deque.add("Dhanu");
		deque.addFirst("Lavanya");
		deque.addLast("Bhavani");
		deque.add("Tanu");
		System.out.println(deque);
		Deque<String> deque1=new ArrayDeque<>();
		deque1.add("Latha");
		deque1.add("Anusha");
		deque1.add("Kamala");
		deque1.addFirst("Tarun");
		deque1.addLast("Varun");
		deque1.add("Giri");
		
		System.out.println(deque1);
		System.out.println(deque.element());
		System.out.println(deque.peek());
		System.out.println(deque.poll());
		System.out.println(deque);
		System.out.println(deque.contains(deque1));
		System.out.println(deque.addAll(deque1));
		System.out.println(deque.peekFirst());
	}

}
