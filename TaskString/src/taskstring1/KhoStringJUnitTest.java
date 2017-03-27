package taskstring1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KhoStringJUnitTest {

	@Test(timeout = 3000)
	public void testChangeTo() {
		String testString = "text of my fantasy is good";
		String toChange = "fantasy";
		String changeWith = "imagination";
		String expected = testString.replace(toChange, changeWith);
		String actual = new KhoString(testString)
		.changeTo(toChange, changeWith);
		assertEquals(expected, actual);
		// assertTrue(expected);
		// check references that they point at the same
		// assertSame(expected, actual);
	}

	@Test(timeout = 3000 /* ,expected = IOException.class */)
	public void testCompareTo() {
		String testString = "text of my fantasy is good";
		String toChange = "fantasy";
		String changeWith = "imagination";
		boolean expected = testString.compareTo(toChange) == 0 ? true : false;
		boolean actual = new KhoString(testString).compareTo(toChange);
		assertEquals(expected, actual);
	}
}
