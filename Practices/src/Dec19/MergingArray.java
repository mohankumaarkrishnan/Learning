package Dec19;

public class MergingArray {

	public static int[] mergeArray(int[] first_array, int[] second_array) {
		int f_len = first_array.length;
		int s_len = second_array.length;
		int[] final_array = new int[f_len + s_len];
		int i = 0, j = 0, k = 0;
		while (i < f_len && j < s_len) {
			if (first_array[i] <= second_array[j]) {
				final_array[k++] = first_array[i++];
			} else {
				final_array[k++] = second_array[j++];
			}
		}
		while (i < f_len) {
			final_array[k++] = first_array[i++];
		}
		while (j < s_len) {
			final_array[k++] = first_array[j++];
		}

		return final_array;
	}

}
