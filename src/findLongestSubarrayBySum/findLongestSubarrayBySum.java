package findLongestSubarrayBySum;

import java.util.Arrays;

public class findLongestSubarrayBySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(Arrays.toString(findLongestSubarrayBySum(12, new int[] { 1, 2, 3, 7, 5 })));
	}

	static int[] findLongestSubarrayBySum(int s, int[] arr) {

		if (arr == null || arr.length == 0)
			return new int[] { -1 };

		int maxS = 0;
		int maxE = -1;
		int currentS = 0;
		int current = 0;
		int j = 0;
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {

			current = current + arr[i];

			if (s < current) {

				while (j < i && s < current) {
					current = current - arr[j];
					j++;
				}
			}

			if (s == current) {// ->
				found = true;

				while (i + 1 < arr.length && arr[i + 1] == 0) {
					i = i + 1;
				}

				if (maxE - maxS < i - j) {
					maxS = j;
					maxE = i;
				}
				i = j;
				++j;
				current = 0;
			}

		}

		if (found)
			return new int[] { maxS + 1, maxE + 1 };
		else
			return new int[] { -1 };
	}

}
