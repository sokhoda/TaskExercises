package taskstring1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		String s = "rfewr fewe21 d;:d23d 2$$2 _2dwd23\\ï1a2ðí #@112\\\\FF óö ô Ôf/.1x";
		String str = null;
		char c;
		s.toUpperCase();
		System.out.println(s);
		String[] other = s.split("\\p{gc=Punct}");
		String otherN = s.replaceAll("\\p{gc=Punct}", " ");
		System.out.println(Arrays.toString(other));
		System.out.println(otherN);
		for (int i = 0; i < s.length(); i++) {
			str = String.valueOf(s.charAt(i));
			// System.out.println(str + " -> " +
			// str.matches("^([0-9]|[^\\w])"));
			// System.out.println(str + " -> " +
			// str.matches("[\\p{InCyrillic}]"));
			System.out.println(str + " -> " + str.matches("\\p{gc=Ll}"));
		}
		System.out.println(s + " -> " + s.matches(".*(1a2)+.*(\\\\\\\\).*"));
		System.out.println((int) 'a' + "=" + (int) 'A' + " " + (int) 'Ö' + "="
				+ (int) 'ö');
		System.out.println((char) 1094);
		c = 'Ì';
		System.out.println(c + " " + Character.isLowerCase(c));
		Character.toLowerCase((int) c);
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		System.out.println("arr[0]=" + arr.get(0));
		System.out.println("size =" + arr.size());
		// String greeting = "Hello";
		// System.out.println(greeting.substring(0, 3).intern() == "Hel");
	}
}
