package arrayMaxConsecutiveSum2;

public class arrayMaxConsecutiveSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArr = { -2, 2, 5, -11, 6 };
		System.out.println(arrayMaxConsecutiveSum2(inputArr));
	}

	static int arrayMaxConsecutiveSum2(int[] inputArray) {

		if (inputArray == null || inputArray.length < 1)
			return 0;
		int max = inputArray[0];
		int current = max;
		int j = 0;
		for (int i = 1; i < inputArray.length; i++) {

			if (current > 0 && inputArray[i] + current > 0) {
				current = current + inputArray[i];
			} else {
				j++;
				current = inputArray[i];
			}

			max = Math.max(max, current);
		}

		return max;

	}
}
