package execises;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Mainn {
	public static void main(String[] args) {
		int[] mass = { 1, 2 };
		List<String> list = new ArrayList<>(10);
		list.add("03");
		list.add("04");
		System.out.println(mass.length + list.size() + ".");

		//checking inclusion
		List<String> list1 = Arrays.asList("A","A","A","C","B","B");
		List<String> list2 = Arrays.asList("A","A","B","B", "D");

		System.out.println("List 1: " + list1);
		System.out.println("List 2: " + list2);
		System.out.println("List 1 - List 2: " + CollectionUtils.subtract(list1, list2));
		System.out.println("List 2 - List 1: " + CollectionUtils.subtract(list2, list1));
		Collection<Object> values = new HashMap<>().values();
		System.out.println(values);
	}

}
