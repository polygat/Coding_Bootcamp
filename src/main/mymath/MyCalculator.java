package main.mymath;

public class MyCalculator {
	public double addition(double x, double y) {
		double max = Double.MAX_VALUE;
		if (x > max - y) {
			throw new IllegalArgumentException();
		}
		return x + y;
	}

	public double multiplication(double x, double y) {
		double max = Double.MAX_VALUE;
		if (y > max / x) {
			throw new IllegalArgumentException();
		}
		return x * y;
	}

	public double division(double x, double y) {
		if (y == 0) {
			throw new IllegalArgumentException();
		}
		double max = Double.MAX_VALUE;
		if (x / y < max) {
			return x / y;
		} else {
			throw new IllegalArgumentException();
		}

	}
}