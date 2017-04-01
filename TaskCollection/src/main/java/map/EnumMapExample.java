package map;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EnumMapExample {

	public enum STATE {
		NEW, RUNNING, WAITING, FINISHED;
	}

	public static void main(String args[]) {

		// Java EnumMap Example 1: creating EnumMap in java with key as enum
		// type STATE
		EnumMap<STATE, String> map = new EnumMap<>(STATE.class);

		System.out.println(map);

		// Java EnumMap Example 2:
		// putting values inside EnumMap in Java
		// we are inserting Enum keys on different order than their natural
		// order
		map.put(STATE.RUNNING, "Program is running");
		map.put(STATE.WAITING, "Program is waiting");
		map.put(STATE.NEW, "Program has just created");
		map.put(STATE.FINISHED, "Program has finished");

		// Java EnumMap Example 3:
		// printing size of EnumMap in java
		System.out.println("Size of EnumMap in java: " + map.size());

		// Java EnumMap Example 5:
		// printing Java EnumMap , should print EnumMap in natural order
		// of enum keys (order on which they are declared)
		System.out.println("EnumMap: " + map);

		// Java EnumMap Example 5:
		// retrieving value from EnumMap in java
		System.out.println(
				"EnumMap key : " + STATE.NEW + " value: " + map.get(STATE.NEW));

		System.out.println("entrySet-------");
		Set<Map.Entry<STATE, String>> eSet = map.entrySet();
		for (Map.Entry<STATE, String> el : eSet) {
			System.out.println(el);
		}

		// Java EnumMap Example 6:
		// Iterating over Java EnumMap
		Iterator<STATE> enumKeySet = map.keySet().iterator();
		while (enumKeySet.hasNext()) {
			STATE currentState = enumKeySet.next();
			System.out.println("key : " + currentState + " value : "
					+ map.get(currentState));
		}

		// Java EnumMap Example 7: checking if EnumMap contains a particular key
		System.out.println("Does stateMap has :" + STATE.NEW + " : "
				+ map.containsKey(STATE.NEW));

		// Java EnumMap Example 8: checking if EnumMap contains a particular
		// value
		System.out.println("Does stateMap has :" + STATE.NEW + " : "
				+ map.containsValue(null));

	}
}
