package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


//		List<Integer> linkedList = new ArrayList<Integer>();
//		linkedList.add(2);
//		linkedList.add(4);
//		linkedList.add(6);
//		System.out.println(linkedList);
//		List<Integer> linkedList1 = new ArrayList<Integer>();
//		linkedList1.add(3);
//		linkedList1.add(6);
//		linkedList1.add(9);
//		System.out.println(linkedList1);
//		
//		linkedList.add(3,8);
//		System.out.println(linkedList);
//		
//		linkedList.addAll(linkedList1);
//		System.out.println(linkedList);
//		linkedList.set(4, 10);
//		System.out.println(linkedList);
//		
//		linkedList.remove(2);
//		
//		System.out.println(linkedList);
////		
////		Collections.reverse(arrayList);
////		
////		arrayList1.add(90);
////		
////		arraylist1.add(60);
////		
////		arrayList1.retainAll (arrayList);
//		
//		
//		
//	}
//	
//
//}
public class Linked_List {
	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<>();

		int add = 0;

		linkedList.add(10);

		linkedList.add(20);

		linkedList.add(30);

		for (int i = 0; i < linkedList.size(); i++) {

			add += linkedList.get(i);
		}
		
		Iterator<Integer> itr = linkedList.iterator();
		
		while (itr.hasNext()) {
			Integer intValue=itr.next();
			System.out.println(intValue);
		}
		
		System.out.println("Addition: " + add);
	}
}
