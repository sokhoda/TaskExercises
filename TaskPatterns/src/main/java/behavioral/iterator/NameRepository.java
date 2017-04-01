package behavioral.iterator;

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

		@Override
		public boolean hasNext() {
			return count < list.size() ;
		}

		@Override
		public Object next() {
			return  hasNext() ? list.get(count++) : null;
		}

	}

}
