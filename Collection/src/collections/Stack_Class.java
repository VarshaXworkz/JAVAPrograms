package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Stack_Class {
	public static void main(String[] args) {
				Stack<Integer> linkedList = new ArrayList<Integer>();
				linkedList.add(2);
				linkedList.add(4);
				linkedList.add(6);
				System.out.println(linkedList);
				Stack<Integer> linkedList1 = new ArrayList<Integer>();
				linkedList1.add(3);
				linkedList1.add(6);
				linkedList1.add(9);
				System.out.println(linkedList1);
				
				linkedList.add(3,8);
				System.out.println(linkedList);
				
				linkedList.addAll(linkedList1);
				System.out.println(linkedList);
				linkedList.set(4, 10);
				System.out.println(linkedList);
				
				linkedList.remove(2);
				
				System.out.println(linkedList);
//				
//				Collections.reverse(arrayList);
//				
//				arrayList1.add(90);
//				
//				arraylist1.add(60);
//				
//				arrayList1.retainAll (arrayList);
				

	}

}
