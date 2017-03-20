package iterator;

public class IteratorRunner {
	public static void main(String[] args) {
		NameRepository repo = new NameRepository();
		Iterator it = repo.getIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		for (Iterator it2 = repo.getIterator(); it2.hasNext();) {
			System.out.println("\n" + it2.next());
		}
	}
}
