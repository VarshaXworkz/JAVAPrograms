package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Count_List {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10 );
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(20);
		list.add(50);
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(30);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(50);
		list.add(50);
		list.add(30);
		list.add(30);
		list.add(40);
		list.add(30);  
		list.add(50);
		list.add(50);
		System.out.println(list);
		int count = Collections.frequency(list,10);
        System.out.println("The integer 10 occurs " + count + " times in the list.");
        int count1 = Collections.frequency(list,20);
        System.out.println("The integer 20 occurs " + count1 + " times in the list.");
        int count2 = Collections.frequency(list,30);
        System.out.println("The integer 30 occurs " + count2 + " times in the list.");
        int count3 = Collections.frequency(list,40);
        System.out.println("The integer 40 occurs " + count3 + " times in the list.");
        int count4= Collections.frequency(list,50);
        System.out.println("The integer 50 occurs " + count4 + " times in the list.");
		

	
	
	}

}
