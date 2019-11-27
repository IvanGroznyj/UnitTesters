package JUnitTests;

import java.util.LinkedList;

public class TestSuite {
	LinkedList<TestCase> tests;
	
	public TestSuite() {
		tests = new LinkedList<TestCase>();
	}
	
	public void add(TestCase test) {
		this.tests.add(test);
	}
	
	public void run(TestResult result) {
		for (int i=0; i<this.tests.size(); i++) {
			this.tests.get(i).run(result);
		}
	}
}
