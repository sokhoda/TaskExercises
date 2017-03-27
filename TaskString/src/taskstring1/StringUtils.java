package taskstring1;

public interface StringUtils {

	int stringSize();

	boolean compareTo(String str);

	String toLowerCase();

	String toUpperCase();

	int[] entries(String of);

	String changeTo(String stringToChange, String changeWith);

	Node[] frequencyOfRepetitions();

}
