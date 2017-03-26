package set;

import java.util.EnumSet;

public class EnumSetDemo {

	// create an enum
	public enum Numbers {
		ONE, TWO, THREE, FOUR, FIVE
	};

	public static void main(String[] args) {

		// create a set
		EnumSet<Numbers> set;
		set = EnumSet.allOf(Numbers.class);
		System.out.println(set);
		// add one element
		set = EnumSet.of(Numbers.FIVE);

		// print the set
		System.out.println("Set:" + set);

		// add another element which replaces the previous
		set = EnumSet.of(Numbers.THREE);

		// print the set. Notice that it has one element
		set.add(Numbers.ONE);
		System.out.println("Set:" + set);

		EnumSet<Numbers> set2 = EnumSet.complementOf(set);
		System.out.println("complementOf:" + set2);
	}
}
