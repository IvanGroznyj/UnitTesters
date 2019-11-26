package JUnitTests;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {
	String name;
	
	public TestCase(String name) {
		this.name = name;
	}
	
	public void run() {
		try {
			this.getClass().getMethod(this.name, null).invoke(this, null);
		} catch (NoSuchMethodException e) {
			System.out.println(e.toString());
		} catch (IllegalAccessException e) {
			System.out.println(e.toString());
		} catch (InvocationTargetException e) {
			System.out.println(e.toString());
		}
		
	}
}