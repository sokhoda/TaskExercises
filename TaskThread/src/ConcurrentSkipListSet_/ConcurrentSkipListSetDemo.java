package ConcurrentSkipListSet_;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetDemo {
	public static void main(String[] args) {

		Set<Integer> set = new ConcurrentSkipListSet<>(Arrays.asList(4, 54, 33,
				23, 5, 6, 57, 3));
		NavigableSet<Integer> set2 = (NavigableSet<Integer>) set;
		// set.add(null);
		System.out.println(set);
		System.out.println(set2);
		// set2.
		Iterator<Integer> it = set.iterator();
		int i = 0;
		while (it.hasNext()) {

			System.out.print("i:" + i);
			System.out.println(" " + it.next());
			if (i++ == 2) {
				set.remove(33);
			}
			System.out.println(set);
		}
	}
}
