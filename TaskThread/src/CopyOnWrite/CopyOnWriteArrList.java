package CopyOnWrite;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrList {
	CopyOnWriteArrList() {

	};

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> cwl = new CopyOnWriteArrayList<>(
				new Integer[] { 2, 35, 6, 7, 4, 3, 2 });
		cwl.add(10);
		cwl.add(10);
		cwl.add(2, 11);
		System.out.println(cwl);
		Iterator<Integer> it = cwl.iterator();
		int count = 0;
		while (it.hasNext()) {
			System.out.println(it.next());
			if (count++ == 2) {
				cwl.set(5, -1);
			}
			// it.remove();

			System.out.println(cwl);
		}
		System.out.println(cwl);
	}
}
