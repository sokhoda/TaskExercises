package list;

import java.util.*;

public class DemoArrayList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 6, 76, 2, 6, 7));
		System.out.println("list:" + list);
		list.add(2, -1);
		System.out.println("list:" + list);
		int[] p = list.stream().mapToInt(Integer::intValue).toArray();

		System.out.println(Arrays.toString(p));

		ListIterator<Integer> it = list.listIterator();

		System.out.println(it.next());
		System.out.println(it.next());
		it.set(-100);
		System.out.println(list);
		System.out.println(it.previous());
		System.out.println(it.next());
		System.out.println(it.previousIndex());
		it.remove();
		it.add(203);
		System.out.println(list);
		System.out.println(list.subList(2, 3));
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		System.out.println(list);

	}
}
