package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DemoLinkedHashMap {

	public static void main(String[] args) {
		Map<String, Double> lMap = new LinkedHashMap<>();
		lMap.put("Today", 34.3);
		lMap.put("is", -3.3);
		lMap.put("a", 1.2);
		lMap.put("good", 0.7);
		lMap.put("wonderful", 3.7);
		lMap.put("awesome", 3.1);
		lMap.put("day", -7.9);

		Set<Entry<String, Double>> set = lMap.entrySet();
		for (Entry<String, Double> entry : set) {
			System.out.print("key=" + entry.getKey());
			System.out.println(" value=" + entry.getValue());
		}

		System.out.println("==============ITERATOR==============");
		lMap.remove("day");
		Iterator<Entry<String, Double>> it = set.iterator();
		while (it.hasNext()) {
			Entry<String, Double> ent = it.next();
			System.out.print("Key =" + ent.getKey());
			System.out.println(" Value =" + ent.getValue());
		}

		NavigableMap<String, Double> sortedMap = new TreeMap<>(lMap);
		System.out.println("treeMap:\n" + sortedMap);

		TreeSet t;
		// System.arraycopy(src, srcPos, dest, destPos, length);
	}
}
