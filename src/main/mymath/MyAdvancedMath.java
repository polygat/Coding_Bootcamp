package main.mymath;

public class MyAdvancedMath {
	public int factorial(int n) {
		if (n > 0 && n < 13) {
			int fact = 1;
			for (int i = 1; i <= n; i++) {
				fact *= i;
			}
			return fact;

		} else {
			throw new IllegalArgumentException("n cannot be 0 < n < 12");
		}
	}

	public double power(int b, int n) {
		if (0 <= n && n >= 20) {
			throw new IllegalArgumentException("n should be 0 <= n <= 20");
		}
		if (n == 0) {
			return 1;
		} else {
			return Math.pow(b, n);
		}
	}

	public int[] reverse(int[] array) {
		if (array.length == 0) {
			throw new IllegalArgumentException("array is empty");
		}
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		return array;
	}
}