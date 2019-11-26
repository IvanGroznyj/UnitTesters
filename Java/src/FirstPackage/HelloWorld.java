package FirstPackage;

import JUnitTests.*;

public class HelloWorld {
	static public void main(String args[]) {
		//System.out.println("Hello World!");
		
		/*
		WasRun test = new WasRun("testMethod");
		assert(!test.wasRun);
		test.run();
		assert(test.wasRun);
		*/
		TestCaseTest testTemplateMethod = new TestCaseTest("testTemplateMethod");
		testTemplateMethod.run();
		
		TestCaseTest testResult = new TestCaseTest("testResult");
		testResult.run();		
		
		TestCaseTest testFailedResult = new TestCaseTest("testFailedResult");
		testFailedResult.run();
		
	}
}
