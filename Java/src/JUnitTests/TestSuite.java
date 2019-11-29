package JUnitTests;

import java.lang.reflect.Method;
import java.util.LinkedList;

public class TestSuite {
	LinkedList<TestCase> tests;
	
	public void SetUp() {}
	
	public void add(TestCase test) {
		this.tests.add(test);
	}
	
	public void setUp() {}
	public void tearDown() {}
	
	public void run(TestResult result) {
		tests = new LinkedList<TestCase>();
		Method[] methods = this.getClass().getMethods();
		for(int i=0; i<methods.length; i++) {
			if (methods[i].getName().startsWith("test") && !methods[i].getName().equals("testSuite")) {
				this.tests.add(new TestCase(methods[i].getName()));
			}
		}
		
		for (int i=0; i<this.tests.size(); i++) {
			System.out.print("Run: " + methods[i].getDeclaringClass().getName()+"."+methods[i].getName() + " ..... ");
			this.tests.get(i).run(result, this);
			System.out.println("Ended.");
		}
	}
}
