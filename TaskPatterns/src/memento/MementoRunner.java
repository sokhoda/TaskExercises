package memento;

import java.util.ArrayList;
import java.util.Arrays;

public class MementoRunner {
	public static void main(String[] args) {

		AddressBook aBook = new AddressBook(new ArrayList<String>(
				Arrays.asList("Maria", "Vasyl", "Peter", "Rachel")));
		System.out.println(aBook);
		// save aBook state
		aBook.preview();
		aBook.removeContact(1);
		aBook.addContact("Tom");
		aBook.addContact("Alan");
		aBook.addContact("Jennifer");
		System.out.println(aBook);
		aBook.undoChanges();
		System.out
		.println("----------------------UndoChanges-------------------------\n"
				+ aBook);

	}
}
