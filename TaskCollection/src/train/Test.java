package train;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer arg0, Integer arg1) {
				return 0;
			}

		});
		set.add(7);
		set.add(3);
		set.add(7);
		System.out.println(set);

		List ll = new LinkedList();
		Map<Integer, Integer> map;
	}
}
