package taskstring1;

import java.util.Arrays;

public class TestStringUtil {
	public static void main(String[] args) {
		KhoString text;

		final String[] TESTSTRINGS = {
				"Each Unicode character, in addition to its value, has certain attributes,"
						+ " or properties. You can match a single character belonging to a particular category with the expression \\p{prop}."
						+ " You can match a single character not belonging to a particular category with the expression \\P{prop}."
						+ "The three supported property types are scripts, blocks, and a \"general\" category."
						+ "Scripts To determine if a code point belongs to a specific script, you can either use the "
						+ "script keyword, or the sc short form, for example, \\p{script=Hiragana}. Alternatively, you can prefix the "
						+ "script name with the string Is, such as \\p{IsHiragana}. ARE are"
						+ "Valid script names supported by Pattern are those accepted by UnicodeScript.forName.",
						"", null };
		for (String element : TESTSTRINGS) {
			System.out.println("---------------------------TESTSTRING = "
					+ (element == null ? "null" : element)
					+ "------------------------");
			text = new KhoString(element);

			System.out.println("stringSize:" + text.stringSize());

			System.out.println("\ncompareTo1:" + text.compareTo("dong"));
			System.out.println("compareTo2:" + text.compareTo(""));
			System.out.println("compareTo3:" + text.compareTo(null));
			System.out.println("compareTo4:" + text.compareTo(element));

			System.out.println("\ntext.toLowerCase:" + text.toLowerCase());
			System.out.println("text.toUpperCase:" + text.toUpperCase());

			System.out.println("\nentries1:"
					+ Arrays.toString(text.entries("dong")));
			System.out.println("entries2:"
					+ Arrays.toString(text.entries("script")));
			System.out.println("entries3:" + Arrays.toString(text.entries("")));
			System.out.println("entries4:"
					+ Arrays.toString(text.entries(null)));

			System.out.println("\noriginal:\n" + text);
			System.out.println("\nreplaced1:"
					+ text.changeTo("script", "«¿Ã≈Õ¿"));
			System.out.println("replaced2:" + text.changeTo("dong", "«¿Ã≈Õ¿"));
			System.out.println("replaced3:" + text.changeTo("", "«¿Ã≈Õ¿"));
			System.out.println("replaced4:" + text.changeTo("script", ""));
			System.out.println("replaced5:" + text.changeTo("", ""));
			System.out.println("replaced6:" + text.changeTo(null, "«¿Ã≈Õ¿"));
			System.out.println("replaced7:" + text.changeTo("script", null));
			System.out.println("replaced8:" + text.changeTo(null, null));

			System.out.println("\nreplaced1:"
					+ text.changeTo2("script", "«¿Ã≈Õ¿"));
			System.out.println("replaced2:" + text.changeTo2("dong", "«¿Ã≈Õ¿"));
			System.out.println("replaced3:" + text.changeTo2("", "«¿Ã≈Õ¿"));
			System.out.println("replaced4:" + text.changeTo2("script", ""));
			System.out.println("replaced5:" + text.changeTo2("", ""));
			System.out.println("replaced6:" + text.changeTo2(null, "«¿Ã≈Õ¿"));
			System.out.println("replaced7:" + text.changeTo2("script", null));
			System.out.println("replaced8:" + text.changeTo2(null, null));

			System.out.println("\nfrequencyOfRepetitions:"
					+ Arrays.toString(text.frequencyOfRepetitions()));
		}

	}
}
