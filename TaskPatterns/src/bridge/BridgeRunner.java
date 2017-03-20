package bridge;

import bridge.abstraction.BaseList;
import bridge.abstraction.MergeList;
import bridge.abstraction.NumberedList;
import bridge.implementation.IList;
import bridge.implementation.OrderedListImpl;

public class BridgeRunner {
	public static void main(String[] args) {
		IList implementator = new OrderedListImpl();

		BaseList listOne = new BaseList();
		listOne.setImplementor(implementator);
		listOne.add("Hallo");
		listOne.add("It's Tuesday");
		listOne.add("Have a nice day!");
		listOne.add("Programming");
		listOne.add("is");
		listOne.add("My favourite job!");
		listOne.add("Imagination");
		listOne.add("is more important");
		listOne.add("than knowledge", 7);

		System.out.println(listOne.get(2));

		NumberedList listTwo = new NumberedList();
		listTwo.setImplementor(implementator);
		System.out.println(listTwo.get(0));

		MergeList listThree = new MergeList('+');
		listThree.setImplementor(implementator);

		System.out.println(listThree.get(0, 2));
		System.out.println(listThree.get(0, 2));
		System.out.println(listThree.get(5));
		System.out
				.println("-------------------------listOne------------------");
		for (int i = 0; i < listOne.count(); i++) {
			System.out.println(listOne.get(i));
		}
		System.out
				.println("-------------------------listTwo------------------");
		for (int i = 0; i < listOne.count(); i++) {
			System.out.println(listTwo.get(i));
		}
		System.out
				.println("-------------------------listThree------------------");
		for (int i = 0; i < listOne.count(); i++) {
			System.out.println(listThree.get(i));
		}

	}
}
