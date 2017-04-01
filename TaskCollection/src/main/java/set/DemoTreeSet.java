package set;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {
	public static void main(String[] args) {
		Set<Integer> hSet = new HashSet<>();

		hSet.addAll(Arrays.asList(0, -1, 4, 5, 6, 3, 6, 4, 2, 1, 67, 5));
		System.out.println("hSet:" + hSet);

		new TreeSet<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});

		Set<Integer> setSuc = new TreeSet<>(hSet);
		System.out.println("setSuc:" + setSuc);

		NavigableSet<Integer> set = new TreeSet<>(hSet);
		System.out.println("first: " + set.first());
		System.out.println("last: " + set.last());
		System.out.println(set);
		System.out.println("tailSet(0):" + set.tailSet(0));
		System.out.println("tailSet(0, false):" + set.tailSet(0, false));
		System.out.println("pollFirst:" + set.pollFirst() + ", set=" + set);
		System.out.println("pollLast:" + set.pollLast() + ", set=" + set);
		System.out.println("lower(3):" + set.lower(3));
		System.out.println("floor(3):" + set.floor(3));
		System.out.println("headSet(4):" + set.headSet(4));
		System.out.println("headSet(4, true):" + set.headSet(4, true));
		System.out.println("descendingSet:" + set.descendingSet());
		System.out.println("contains(12):" + set.contains(12));
		System.out.println("contains(2):" + set.contains(2));
		System.out.println(Arrays.toString(set.toArray(new Integer[0])));

	}

}
