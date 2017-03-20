package concurrentmap;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {
	public static void main(String[] args) {
		Map<Model, Integer> mod = new EnumMap<Model, Integer>(Model.class);
		mod.put(Model.MERCEDES, 234);
		mod.put(Model.VOLKSWAGEN, 12);
		mod.put(Model.LANOS, 22);
		System.out.println(mod.keySet());
		System.out.println(mod.values());

		Map<Integer, Integer> muster = new HashMap<>();
		muster.put(3, 488);
		muster.put(413, 34);
		muster.put(33, 54);
		System.out.println("muster:" + muster);
		Map<Number, Number> constMap1 = new ConcurrentSkipListMap<>(muster);
		System.out.println("constMap1:" + constMap1);

		Map<Double, Integer> muster2 = new LinkedHashMap<>();
		muster2.put(3.3, 488);
		muster2.put(1413.11, 34);
		muster2.put(13.1, 654);
		muster2.put(554., 54);
		System.out.println("muster2:" + muster2);
		constMap1 = new ConcurrentSkipListMap<>(muster2);
		System.out.println("constMap1:" + constMap1);
		// ----------------------
		Map<Integer, Integer> map = new ConcurrentSkipListMap<Integer, Integer>();

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
			}
			System.out.println(map);
		}
	}
}
