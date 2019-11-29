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
	
	public void run(TestResult result, Object instance){
		result.testStarted();
		((TestSuite)instance).setUp();
		try {
			instance.getClass().getMethod(this.name).invoke(instance);
		} catch (Exception e) {
			System.out.println(e.toString());
			result.testFailed();
		}
		((TestSuite)instance).tearDown();
	}
}
