package test.mymath;

import org.junit.Assert;
import org.junit.Test;

import main.mymath.MyAdvancedMath;

public class MyAdvancedMathTest {
	@Test(expected = IllegalArgumentException.class)
	public void testFactorialNumberNotNegative() {
		MyAdvancedMath add = new MyAdvancedMath();
		add.factorial(-1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testFactorialNumberNotIntiger() {
		MyAdvancedMath add = new MyAdvancedMath();
		add.factorial(13);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPowerRange() {
		MyAdvancedMath add = new MyAdvancedMath();
		add.power(2, 30);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testReverseIsEmpty() {
		MyAdvancedMath add = new MyAdvancedMath();
		add.reverse(new int[] {});
	}

	@Test
	public void testReverseDoReverse() {
		MyAdvancedMath add = new MyAdvancedMath();
		Assert.assertArrayEquals(new int[] { 3, 2, 1 }, add.reverse(new int[] { 1, 2, 3 }));
	}
}
