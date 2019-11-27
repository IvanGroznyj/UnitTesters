package FirstPackage;

import JUnitTests.*;

public class TestRunner {
	static public void main(String args[]) {
		TestSuite suite = new TestSuite();
		suite.add(new TestCaseTest("testTemplateMethod"));
		suite.add(new TestCaseTest("testResult"));
		suite.add(new TestCaseTest("testFailedResult"));
		suite.add(new TestCaseTest("testFailedResultFormatting"));
		
		TestResult result = new TestResult();
		suite.run(result);
		System.out.println(result.summary());
	}
}
