package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hash_Set {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(40);
		set.add(30);
		set.add(50);
		set.add(20);
		set.add(40);
		set.add(10);
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.contains(1));
		
		int add=0;
		Iterator<Integer> itr = set.iterator();

		while (itr.hasNext()) {
			add+=itr.next();
			System.out.println("Addition = "+add);
		}

	}

}
