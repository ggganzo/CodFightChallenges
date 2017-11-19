package SumOfTwo;

import java.util.HashSet;
import java.util.Set;

public class SumOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3 };
		int[] b = { 10, 20, 30, 40 };
		System.out.println(sumOfTwo(a, b, 42));
	}

	static boolean sumOfTwo(int[] a, int[] b, int v) {

		if (a == null || b == null || v == 0)
			return false;

		Set<Integer> m = new HashSet<>();

		for (int i = 0; i < a.length; i++) {
			m.add(a[i]);
		}

		Integer diff;
		for (int i = 0; i < b.length; i++) {
			diff = v - b[i];
			if (m.contains(diff))
				return true;

		}
		return false;
	}

}
