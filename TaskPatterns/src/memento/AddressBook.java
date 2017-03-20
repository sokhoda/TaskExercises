package memento;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	private List<String> contacts;
	private AdrBookMemento undo;

	public AddressBook() {
	}

	public AddressBook(List<String> state) {
		this.contacts = state;
	}

	private class AdrBookMemento {
		private List<String> state;

		private AdrBookMemento() {
			state = new ArrayList<>(contacts);
		}

		public List<String> getState() {
			return state;
		}

		public void setState(List<String> state) {
			this.state = state;
		}

	}

	public void preview() {
		undo = new AdrBookMemento();
	}

	public void undoChanges() {
		contacts = undo.getState();
	}

	public List<String> getContacts() {
		return contacts;
	}

	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}

	public void addContact(String contact) {
		contacts.add(contact);
	}

	public boolean removeContact(int inx) {
		boolean res = false;
		if (inx < contacts.size()) {
			contacts.remove(inx);
			res = true;
		}
		return res;
	}

	@Override
	public String toString() {
		return "AddressBook [contacts=" + contacts + "]";
	}

}
