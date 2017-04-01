package taskstring1;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KhoString implements StringUtils {
	public static final String INSTRING = "Dong-ding-dong";
	private String str;

	public KhoString() {
		this.str = INSTRING;
	}

	public KhoString(String str) {
		this.str = str;
	}

	@Override
	public int stringSize() {
		int res = 0;
		if (str != null) {
			res = str.length();
		}
		return res;
	}

	@Override
	public boolean compareTo(final String str) {
		boolean res = false;
		if (this.str != null && str != null) {
			res = this.str.compareToIgnoreCase(str) == 0 ? true : false;
		}
		return res;
	}

	@Override
	public String toLowerCase() {
		char c;
		StringBuilder res = new StringBuilder();
		if (str != null) {
			for (int i = 0; i < str.length(); i++) {
				c = str.charAt(i);
				if (String.valueOf(c).matches("[\\p{gc=Lu}]")) {
					c = (char) Character.toLowerCase((int) c);
				}
				res.append(c);
			}
			System.out.println(res);
		}
		return res.toString();
	}
	@Override
	public String toUpperCase() {
		char c;
		StringBuilder res = new StringBuilder();

		if (str != null) {
			for (int i = 0; i < str.length(); i++) {
				c = str.charAt(i);
				if (String.valueOf(c).matches("[\\p{gc=Ll}]")) {
					c = (char) Character.toUpperCase((int) c);
				}
				res.append(c);
			}
			System.out.println(res);
		}
		return res.toString();
	}
	@Override
	public int[] entries(final String of) {
		int[] res = null;
		if (str != null && of != null && !of.isEmpty()) {
			List<Integer> arr = new ArrayList<Integer>();
			if (of != null) {
				Pattern pat = Pattern.compile(of);
				Matcher mat = pat.matcher(str);
				while (mat.find()) {
					arr.add(mat.start());
				}
				if (arr.size() > 0) {
					System.out.println("Entries found at:" + arr.toString());
					res = arr.stream().mapToInt(Integer::intValue).toArray();
				} else {
					System.out.println("No entries found.");
				}
			}
		} else {
			System.out.println("Pattern has zero length.");
		}
		return res;
	}

	public int[] entries2(final String of) {
		int[] res = null;
		if (of.length() > 0) {
			List<Integer> arr = new ArrayList<Integer>();
			int k = 0;
			int j;
			if (of != null) {
				while (k < str.length()) {
					j = str.indexOf(of, k);
					if (j != -1) {
						arr.add(j);
						k = j + of.length();
					}
				}
				if (arr.size() > 0) {
					System.out.println("Entries found at:" + arr.toString());
					res = arr.stream().mapToInt(Integer::intValue).toArray();
				} else {
					System.out.println("No entries found.");
				}
			}
		} else {
			System.out.println("Pattern has zero length.");
		}
		return res;
	}

	@Override
	public String changeTo(final String stringToChange, final String changeWith) {
		String result = str;
		if (str != null && stringToChange != null && changeWith != null
				&& stringToChange.length() > 0) {
			result = str.replaceAll(stringToChange, changeWith);
		}
		return result;
	}

	public String changeTo2(final String stringToChange, final String changeWith) {
		StringBuilder res = new StringBuilder();
		String result = str;

		if (stringToChange != null && stringToChange.length() != 0) {
			int begInx = 0;
			int[] inx = entries(stringToChange);
			if (inx != null) {
				for (int j : inx) {
					res.append(str.substring(begInx, j));
					res.append(changeWith);
					begInx = j + stringToChange.length();
				}
			} else {
				res.append(str);
			}
			result = res.toString();
		}
		return result;
	}

	@Override
	public Node[] frequencyOfRepetitions() {
		Node[] res = null;
		List<Node> arr = new ArrayList<>();
		String curWord;
		int curInx;

		if (str != null) {
			String otherN = str.replaceAll("\\p{gc=Punct}", " ");
			StringTokenizer tk = new StringTokenizer(otherN, " ");
			while (tk.hasMoreTokens()) {
				curWord = tk.nextToken();
				curInx = getWordInxIgnoreCase(arr, curWord);
				if (curInx == -1) {
					arr.add(new Node(curWord.toLowerCase(), 1));
				} else {
					arr.get(curInx).incrementEntries();
				}
			}
			res = arr.toArray(new Node[0]);
		}
		return res;
	}

	public int getWordInxIgnoreCase(List<Node> arr, String word) {
		int res = -1;
		if (word != null && word.length() > 0 && arr != null) {
			int i = 0;
			while (i < arr.size()
					&& !arr.get(i).getValue().equalsIgnoreCase(word)) {
				i++;
			}
			if (i < arr.size()) {
				res = i;
			}
		}
		return res;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return str;
	}

}
