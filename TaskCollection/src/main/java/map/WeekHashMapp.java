package map;

import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;

public class WeekHashMapp {
	public static void main(String[] args) {
		Map<Date, String> map = new WeakHashMap<>();
		Date data = new Date();
		map.put(data, "information");
		data = null;
		System.gc();
		for (int i = 0; i < 10000; i++) {
			if (map.isEmpty()) {
				System.out.println(i + " Empty!");
				break;
			}
		}

	}
}
