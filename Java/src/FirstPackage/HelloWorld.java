package FirstPackage;

import JUnitTests.*;

public class HelloWorld {
	static public void main(String args[]) {
		//System.out.println("Hello World!");
		WasRun test = new WasRun("testMethod");
		assert(!test.wasRun);
		test.run();
		assert(test.wasRun);
		//TestCaseTest n = new TestCaseTest("testRunning");
		//n.run();
	}
}
