package FirstPackage;

import JUnitTests.TestCase;
import JUnitTests.TestResult;
import JUnitTests.TestSuite;
import JUnitTests.WasRun;

public class TestCaseTest extends TestCase{
	WasRun test = null;
	TestResult result;
	
	public TestCaseTest(String name) {
		super(name);
	}
	
	public void setUp() {
		super.setUp();
		result = new TestResult();
	}
	
	public void testTemplateMethod() throws Exception {
		test = new WasRun("testMethod");
		test.run(result);
		assert("setUp testMethod tearDown ".equals(this.test.log));
	}
	
	public void testResult() {
		test = new WasRun("testMethod");
		test.run(result);
		assert("1 run, 0 failed".equals(result.summary()));
	}
	
	public void testFailedResult() {
		test = new WasRun("testWrongMethod");
		test.run(result);
		assert("1 run, 1 failed".equals(result.summary()));
	}
	
	public void testFailedResultFormatting() {
		result.testStarted();
		result.testFailed();
		assert("1 run, 1 failed".equals(result.summary()));
	}
	
	public void testSuite() {
		TestSuite suite = new TestSuite();
		suite.add(new WasRun("testMethod"));
		suite.add(new WasRun("testWrongMethod"));
		suite.run(result);
		assert("2 run, 1 failed".equals(result.summary()));
	}
}