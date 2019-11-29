package SomeClassForExample;

import JUnitTests.TestSuite;

public class TestsForSomeClass extends TestSuite{
	SomeClass smc;
	
	public void setUp() {
		smc = new SomeClass(2, 3);
	}
	
	public void tearDown() {}
	
	public void testSum() {
		assert(smc.Sum() == 5);
	}
	
	public void testMinus() {
		assert(smc.Minus() == -1);
	}
	
	public void testMultiply() {
		assert(smc.Multiply() == 6);
	}
	
	public void testWrongMinus() {
		assert(smc.Multiply() != 1);
	}
	
}
