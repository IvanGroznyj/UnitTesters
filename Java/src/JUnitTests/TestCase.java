package JUnitTests;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {
	String name;
	String className;
	Object classObj;
	
	public TestCase(String name, String className) {
		this.name = name;
		this.className = className;
	}
	
	public void setUp() {}
	public void tearDown() {}
	
	public void run(TestResult result){
		result.testStarted();
		this.setUp();
		try {
			Class.forName(className).getMethod(this.name).invoke(Class.forName(className).newInstance());
		} catch (Exception e) {
			e.printStackTrace();
			result.testFailed();
		}
		this.tearDown();
	}
}
