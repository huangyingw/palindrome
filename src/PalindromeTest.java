import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class PalindromeTest {
	private static final Logger logger = Logger.getLogger(PalindromeTest.class
			.getName());
	protected String testName;
	private int test;
	private Boolean expect;

	public PalindromeTest(String testName, int test, Boolean expect) {
		this.testName = testName;
		this.test = test;
		this.expect = expect;
	}

	@Test
	public void testRun() throws Exception {
		logger.info("Starting Test: " + testName);
		Palindrome palindrome = new Palindrome(test);
		//		Assert.assertTrue(expect.equals(palindrome.isPalindrome()));
		logger.info("Completed Test: " + testName);
	}

	@Parameters
	public static List<Object[]> getTestCases() throws Exception {
		List<Object[]> testCases = new ArrayList<Object[]>();
		testCases.add(new Object[] { "PalindromeTest case #1: ",
				324243223,
				false
		});
		testCases.add(new Object[] { "PalindromeTest case #2: ",
				424242424, true
		});
		return testCases;
	}
}
