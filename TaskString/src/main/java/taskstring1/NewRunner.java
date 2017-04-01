package taskstring1;

import java.util.Arrays;

public class NewRunner {
	public static void main(String[] args) {
		KhoString str = new KhoString(
				"er3f to e r34r TO r3we the d 34 THE to the ff3 CD43c.e  E#$ Í‡ÍÛÔ 7():‚ˆ%Û4 ≥≥¿¿÷”  Ò‚r3r3");

		KhoString text = new KhoString(
				"Each Unicode character, in addition to its value, has certain attributes,"
						+ " or properties. You can match a single character belonging to a particular category with the expression \\p{prop}."
						+ " You can match a single character not belonging to a particular category with the expression \\P{prop}."
						+ "The three supported property types are scripts, blocks, and a \"general\" category."
						+ "Scripts To determine if a code point belongs to a specific script, you can either use the "
						+ "script keyword, or the sc short form, for example, \\p{script=Hiragana}. Alternatively, you can prefix the "
						+ "script name with the string Is, such as \\p{IsHiragana}."
						+ "Valid script names supported by Pattern are those accepted by UnicodeScript.forName.");
		KhoString text2 = new KhoString();

		String[] arr = str.getStr().split("t1he|to1|\\\\");
		// String[] arr = str.getStr().split("");
		System.out.println(Arrays.toString(arr));
		KhoString str2 = new KhoString();
		str.entries("r3");
		str2.entries2("dong");
		System.out.println("orig:" + str2);

		System.out.println("replaced:" + str2.changeTo("dong", "bong"));
		System.out.println("replaced:" + str.changeTo2("r3", "XX"));
		System.out.println(Arrays.toString(text.frequencyOfRepetitions()));
		System.out.println(Arrays.toString(text2.frequencyOfRepetitions()));
		// // System.out.println(str2.toLowerCase().length());
		// str.toUpperCase();
		// str.toLowerCase();
		// System.out.println(Arrays.toString(str.entries("3")));
		// System.out.println(Arrays.toString(str.entries2("r3")));

	}
}
