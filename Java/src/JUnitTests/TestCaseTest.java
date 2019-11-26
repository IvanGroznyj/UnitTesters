package JUnitTests;

public class TestCaseTest extends TestCase{
	WasRun test = null;	
	
	public TestCaseTest(String name) {
		super(name);
	}
	
	public void setUp() {
		super.setUp();
	}
	
	public void testTemplateMethod() throws Exception {
		test = new WasRun("testMethod");
		test.run();
		//System.out.println("setUp testMethod tearDown ".equals(this.test.log));
		assert("setUp testMethod tearDown ".equals(this.test.log));
	}
	
	public void testResult() {
		test = new WasRun("testMethod");
		TestResult result = test.run();
		//System.out.println("1 run, 0 failed" == result.summary());
		assert("1 run, 0 failed".equals(result.summary()));
	}
	
	public void testFailedResult() {
		test = new WasRun("wrongMethod");
		TestResult result = test.run();
		//System.out.println(result.summary());
		assert("1 run, 1 failed".equals(result.summary()));
	}
}