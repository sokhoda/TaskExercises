package set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_ {
	public static void main(String[] args) {
		Set<String> lhs = new LinkedHashSet<>();
		// Set<String> lhs = new HashSet<String>();
		lhs.addAll(Arrays.asList("Today", "is", "a", "good"));
		lhs.add("day");
		for (String entry : lhs) {
			System.out.println(entry);
		}

		System.out.println("==============ITERATOR==============");
		lhs.remove("day");
		Iterator<String> it = lhs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		Set<String> ff = new LinkedHashSet<>(lhs);
		System.out.println(ff);
	}
}