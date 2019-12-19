package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Dec19.LargestSubString;

public class TestLargestSubString {

	@Test
	public void HasCommonSubstring() {
		String result = LargestSubString.getLargestSubString("abcdxyz", "xyzabcd");
		String expected = "abcd";
		assertEquals(expected, result);
	}

	@Test
	public void HasNoCommonSubstring() {
		String result = LargestSubString.getLargestSubString("fghjk", "xyzabcd");
		String expected = "No Common substring";
		assertEquals(expected, result);
	}

}
