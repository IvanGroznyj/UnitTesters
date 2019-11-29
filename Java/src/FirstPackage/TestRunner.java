package FirstPackage;

import JUnitTests.*;
import SomeClassForExample.TestsForSomeClass;

public class TestRunner {
	static public void main(String args[]) {
		TestsForSomeClass tests2 = new TestsForSomeClass();
		TestResult result2 = new TestResult();
		tests2.run(result2);
		System.out.println(result2.summary());
	}
}
