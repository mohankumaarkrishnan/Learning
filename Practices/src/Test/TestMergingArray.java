package Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;

import java.util.Arrays;

import org.junit.Test;
import Dec19.MergingArray;

public class TestMergingArray {

	@Test
	public void merge_withNegativeArrays() {
		int[] result = MergingArray.mergeArray(new int[] { -9, -7, -3, -1 }, new int[] { -10, -8, -7, -5, -2 });
		int[] expected = { -10, -9, -8, -7, -7, -5, -3, -2, -1 };
		assertArrayEquals(expected, result);
	}

	@Test
	public void merge_withPositiveArrays() {
		int[] result = MergingArray.mergeArray(new int[] { 1, 9, 19, 35, 46 }, new int[] { 10, 18, 23, 29, 37, 45 });
		int[] expected = { 1, 9, 10, 18, 19, 23, 29, 35, 37, 45, 46 };
		assertArrayEquals(expected, result);
	}

	@Test
	public void merge_withMixedArrays() {
		int[] result = MergingArray.mergeArray(new int[] { -9, -7, -3, -1, 35, 46 }, new int[] { -10, -8, -7, 37, 45 });
		int[] expected = { -10, -9, -8, -7, -7, -3, -1, 35, 37, 45, 46 };
		assertArrayEquals(expected, result);
	}

	@Test
	public void negativeTest_withMixedArrays() {
		int[] result = MergingArray.mergeArray(new int[] { -9, -7, -3, -1, 35, 46 }, new int[] { -10, -8, -7, 37, 45 });
		int[] expected = { -10, -9, -8, -7, -3, -7, -1, 35, 37, 45, 46 };
		boolean value = Arrays.equals(expected, result);
		assertFalse(value);
	}

}
