package FirstPackage;

import java.lang.reflect.Method;

import JUnitTests.*;

public class TestRunner {
	static public void main(String args[]) {
		//TestSuite suite = new TestSuite();
		
		TestCaseTest tests = new TestCaseTest();
		
		
		//suite.add(new TestCaseTest("testResult"));
		//suite.add(new TestCaseTest("testFailedResult"));
		//suite.add(new TestCaseTest("testFailedResultFormatting"));
		
		TestResult result = new TestResult();
		tests.run(result);
		System.out.println(result.summary());
	}
}
