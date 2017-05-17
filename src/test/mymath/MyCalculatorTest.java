package test.mymath;

import org.junit.*;
import main.mymath.*;

public class MyCalculatorTest {
	@Test(expected = IllegalArgumentException.class)
	public void testDivisionCheckDenominator() {
		MyCalculator add = new MyCalculator();
		add.division(1, 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAdditionCheckNotOverflow() {
		MyCalculator add = new MyCalculator();
		add.addition(0.1, Double.MAX_VALUE);
		add.division(0.1, Double.MAX_VALUE);
		add.multiplication(0.1, Double.MAX_VALUE);
	}

	@Test
	public void testMultiplicationOfZero() {
		MyCalculator add = new MyCalculator();
		Assert.assertEquals(0.0, add.multiplication(10, 0), 1e-15);

	}
}