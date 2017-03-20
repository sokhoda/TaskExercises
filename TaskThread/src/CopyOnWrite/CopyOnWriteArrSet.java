package CopyOnWrite;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArrSet {
	public static void main(String[] args) {
		CopyOnWriteArraySet<Integer> cws = new CopyOnWriteArraySet<>();
		cws.add(10);
		cws.add(15);
		cws.add(13);
		cws.add(14);
		cws.add(11);
		cws.add(null);
		System.out.println(cws);
		Iterator<Integer> it = cws.iterator();
		int count = 0;
		while (it.hasNext()) {
			System.out.println(it.next());
			if (count++ == 2) {
				cws.remove(11);
			}
			// it.remove();

			System.out.println(cws);
		}
		System.out.println(cws);
	}
}
