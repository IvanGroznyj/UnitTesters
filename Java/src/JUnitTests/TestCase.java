package JUnitTests;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {
	String name;
	
	public TestCase(String name) {
		this.name = name;
	}
	
	public void setUp() {}
	public void tearDown() {}
	
	public void run(TestResult result){
		result.testStarted();
		this.setUp();
		try {
			this.getClass().getMethod(this.name, null).invoke(this, null);
		} catch (Exception e) {
			System.out.println(" = " + e.toString());
			result.testFailed();
		}
		this.tearDown();
	}
}
