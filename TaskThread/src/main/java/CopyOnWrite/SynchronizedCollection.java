package CopyOnWrite;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SynchronizedCollection {
	public static void main(String[] args) {

		Set<Integer> set = Collections.synchronizedSet(new HashSet<Integer>(
				Arrays.asList(4, 54, 33, 23, 5, 6, 57, 3)));
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
