package test.mymath;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ MyCalculatorTest.class, MyAdvancedMathTest.class })
public class MathTestSuite {
	// the class remains empty, used only as a holder for the above annotations
}