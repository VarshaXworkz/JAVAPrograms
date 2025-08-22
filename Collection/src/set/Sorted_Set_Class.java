package set;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sorted_Set_Class {
	public static void main(String[] args) {
		SortedSet<Integer> set=new TreeSet<>();
		set.add(40);
		set.add(30);
		set.add(50);
		set.add(20);
		set.add(40);
		set.add(10);
		System.out.println(set);
		System.out.println(set.headSet(30));
		System.out.println(set.tailSet(40));
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.subSet(20, 50));
	}

}
