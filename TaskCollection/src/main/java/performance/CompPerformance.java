package performance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class CompPerformance {
	private final Random rand = new Random();
	private static final int[] VOL = new int[] { 100_000, 1_000_000, 4_000_000 };
	private ArrayList<Integer> arr;
	private LinkedList<Integer> list;
	private int inx;
	private long time1;
	private long time2;

	public static void main(String[] args) {
		CompPerformance cp = new CompPerformance();
		cp.compareAccessTime();
		cp.compareSetTime();
		cp.compareInsertTime();
	}

	public void compareAccessTime() {
		System.out
				.println("------------------------COMPARE GET TIME ----------------");
		for (int element : VOL) {
			arr = new ArrayList();
			list = new LinkedList<Integer>();

			for (int i = 0; i < element; i++) {
				list.add(rand.nextInt(element));
				arr.add(rand.nextInt(element));
			}

			inx = rand.nextInt(element);
			time1 = System.nanoTime();
			System.out.printf("%-25s%10d", "arr.get(" + inx + ") = ",
					arr.get(inx));
			time2 = System.nanoTime();
			System.out.printf("%20s%10d\n", " time:", (time2 - time1));

			time1 = System.nanoTime();
			System.out.printf("%-25s%10d", "list.get(" + inx + ") = ",
					list.get(inx));
			time2 = System.nanoTime();
			System.out.printf("%20s%10d\n", " time:", (time2 - time1));
		}

	}

	public void compareSetTime() {

		System.out
				.println("------------------------COMPARE SET TIME ----------------");
		for (int element : VOL) {
			arr = new ArrayList();
			list = new LinkedList<Integer>();

			for (int i = 0; i < element; i++) {
				list.add(rand.nextInt(element));
				arr.add(rand.nextInt(element));
			}

			inx = rand.nextInt(element);
			time1 = System.nanoTime();
			System.out.printf("%-25s%10d", "arr.set(" + inx + ") = ",
					arr.set(inx, rand.nextInt(element)));
			time2 = System.nanoTime();
			System.out.printf("%20s%10d\n", " time:", (time2 - time1));

			time1 = System.nanoTime();
			System.out.printf("%-25s%10d", "list.set(" + inx + ") = ",
					list.set(inx, rand.nextInt(element)));
			time2 = System.nanoTime();
			System.out.printf("%20s%10d\n", " time:", (time2 - time1));
		}

	}

	public void compareInsertTime() {

		System.out
				.println("------------------------COMPARE INSERTION TIME ----------------");
		for (int element : VOL) {
			arr = new ArrayList();
			list = new LinkedList<Integer>();

			for (int i = 0; i < element; i++) {
				list.add(rand.nextInt(element));
				arr.add(rand.nextInt(element));
			}

			inx = rand.nextInt(element);
			time1 = System.nanoTime();
			System.out.printf("%-25s", "arr.add(" + inx + ") ");
			arr.add(inx, rand.nextInt(element));
			time2 = System.nanoTime();
			System.out.printf("%20s%10d\n", " time:", (time2 - time1));

			time1 = System.nanoTime();
			System.out.printf("%-25s", "list.add(" + inx + ") ");
			list.add(inx, rand.nextInt(element));
			time2 = System.nanoTime();
			System.out.printf("%20s%10d\n", " time:", (time2 - time1));
		}

	}
}
