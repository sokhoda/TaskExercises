package map;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoHashMap {
	public static void main(String[] args) {
		Collection obj;

		Set<Double> lSet = new HashSet<>();
		lSet.add(434.2);
		// lSet.a
		Collection<Double> nSet = lSet;
		// nSet.
		Map<String, Double> lMap = new HashMap<>();

		Map<String, Double> lMap2 = new HashMap<>();

		lMap.put("Today", 34.3);
		lMap.put("is", -3.3);
		lMap.put("a", 1.2);
		lMap.put("good", 0.7);
		lMap.put("day", -117.9);

		// all values in the map
		System.out.println("values = " + lMap.values());

		lMap2.putAll(lMap);
		System.out.println(lMap2.values());

		Set<Entry<String, Double>> set = lMap.entrySet();
		for (Entry<String, Double> entry : set) {
			System.out.print(entry + "\n");
			// System.out.print("key=" + entry.getKey());
			// System.out.println(" value=" + entry.getValue());
		}
		// remove if the get(key) == value(34.3)
		System.out.println(lMap.remove("Today", 34.3));

		System.out.println("==============ITERATOR==============");
		Iterator<Entry<String, Double>> it = set.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("==============HashSet==============");
		Double[] arr = lSet.toArray(new Double[0]);
		System.out.println(Arrays.toString(arr));

	}
}
