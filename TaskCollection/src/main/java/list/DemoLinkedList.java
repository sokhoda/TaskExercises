package list;

import java.util.Arrays;
import java.util.LinkedList;

public class DemoLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>(
				Arrays.asList(6, 235, 65, 7, 56, 3, 32, 56, 0, 0, 2));
		list.add(2);
		list.offer(3);
		System.out.println("list:" + list);
		// list.poll();
		list.addFirst(12);
		System.out.println("list:" + list);
		list.offer(44);
		System.out.println("list:" + list);
		list.offerLast(45);
		System.out.println("list:" + list);
		list.addLast(46);
		System.out.println("list:" + list);
		System.out.println(list.remove());
		System.out.println("list:" + list);
		System.out.println(list.remove(5));
		System.out.println("list:" + list);
		list.addFirst(2);
		System.out.println("list:" + list);
		list.removeLastOccurrence(new Integer(2));
		System.out.println("list:" + list);
		list.remove(new Integer(2));
		System.out.println("list:" + list);

	}
}
