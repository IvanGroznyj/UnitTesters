package FirstPackage;

import JUnitTests.TestCase;
import JUnitTests.WasRun;

public class TestCaseTest extends TestCase{
	public TestCaseTest(String name) {
		super(name);
	}
	
	void testRunning() {
		WasRun test = new WasRun("testMethod");
		assert(!test.wasRun);
		test.run();
		assert(test.wasRun);
	}
}