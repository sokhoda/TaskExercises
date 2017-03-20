package iterator;

import java.util.Arrays;
import java.util.List;

public class NameRepository implements Container {
	private List<String> list = Arrays.asList("Natalya", "Marta", "Olena",
			"Oksana");

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {
		private int count = 0;

		public NameIterator() {
		}

		@Override
		public boolean hasNext() {
			boolean res = false;
			if (count < list.size()) {
				res = true;
			}
			return res;
		}

		@Override
		public Object next() {
			Object res = null;
			if (hasNext()) {
				res = list.get(count++);
			}
			return res;
		}

	}

}
