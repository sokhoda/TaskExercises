package concurrentmap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new ConcurrentHashMap<Integer, Integer>();

		map.put(144, 12);
		map.put(-144, 1);
		map.put(444, 14);
		map.put(64, 21);
		// map.put(null, 1);
		System.out.println(map);
		Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
		int i = 0;
		while (it.hasNext()) {
			Entry<Integer, Integer> entry = it.next();
			System.out.println(entry.getKey() + "=" + entry.getValue());
			if (i++ == 2) {
				map.replace(444, -2);
				map.put(1, 1);
			}
			System.out.println(map);
		}
	}
}
