/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskstring1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

/**
 *
 * @author Yaroslav Revin
 */
public class MyString implements StringUtils {
	private final String str;

	public MyString() {
		this("Dong-ding-dong");
	}

	public MyString(String str) {
		this.str = str;
	}

	@Override
	public int stringSize() {
		return str.length();
	}

	@Override
	public boolean compareTo(String str) {
		return this.str.equalsIgnoreCase(str);
	}

	@Override
	public String toUpperCase() {
		return str.toUpperCase();
	}

	@Override
	public String toLowerCase() {
		return str.toLowerCase();
	}

	@Override
	public int[] entries(String pattern) {
		if (pattern == null || pattern.equals("")) {
			return new int[] {};
		}

		ArrayList<Integer> indexesList = new ArrayList<>();
		int index = 0;
		int patternLength = pattern.length();

		while (true) {
			index = str.indexOf(pattern, index);
			if (index != -1) {
				indexesList.add(index);
				index += patternLength;
			} else {
				break;
			}
		}

		int[] indexes = new int[indexesList.size()];
		for (int i = 0; i < indexes.length; i++) {
			indexes[i] = indexesList.get(i);
		}
		return indexes;
	}

	@Override
	public String changeTo(String stringToChange, String changeWith) {

		return str.replace(stringToChange, changeWith);

	}

	@Override
	public Node[] frequencyOfRepetitions() {

		String[] words = str.split("\\W");
		ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(words));
		LinkedHashSet<String> uniqueWords = new LinkedHashSet<>();

		wordsList.stream().filter((word) -> !word.equals(""))
				.forEach((word) -> uniqueWords.add(word.toLowerCase()));

		ArrayList<Node> nodesList = new ArrayList<>();

		uniqueWords.stream()
				.forEach(
						(uniqueWord) -> {
							int count = (int) wordsList
									.stream()
									.filter((word) -> word
											.equalsIgnoreCase(uniqueWord))
									.count();
							nodesList.add(new Node(uniqueWord, count));
						});

		return nodesList.toArray(new Node[nodesList.size()]);
	}

	@Override
	public String toString() {
		return str;
	}
}
