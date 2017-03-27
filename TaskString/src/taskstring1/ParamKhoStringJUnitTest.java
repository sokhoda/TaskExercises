package taskstring1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParamKhoStringJUnitTest {
	private String input;
	private int expected;
	private KhoString khoString;

	public ParamKhoStringJUnitTest(String input, int expected) {
		this.input = input;
		this.expected = expected;
	}

	@Before
	public void init() {
		khoString = new KhoString(input);
	}

	@Parameterized.Parameters
	public static Collection someMethod() {
		return Arrays.asList(new Object[][] {
				{ "text of my fantasy is good", 26 }, { "text of ", 8 } });
	}

	@Test
	public void testStringSize() {
		System.out.println("input parameter:" + input);
		assertEquals(expected, khoString.stringSize());
	}
}
