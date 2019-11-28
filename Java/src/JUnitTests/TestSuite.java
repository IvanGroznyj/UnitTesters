package JUnitTests;

import java.lang.reflect.Method;
import java.util.LinkedList;

import com.sun.org.apache.xpath.internal.operations.And;

import FirstPackage.TestCaseTest;
import sun.net.NetHooks;

public class TestSuite {
	LinkedList<TestCase> tests;
	
	public void SetUp() {}
	
	public void add(WasRun test) {
		this.tests.add(test);
	}
	
	public void run(TestResult result) {
		tests = new LinkedList<TestCase>();
		Method[] methods = this.getClass().getMethods();
		for(int i=0; i<methods.length; i++) {
			if (methods[i].getName().startsWith("test") && !methods[i].getName().equals("testSuite")) {
				this.tests.add(new TestCase(methods[i].getName(), methods[i].getDeclaringClass().getName()));
				System.out.println("Added " + methods[i].getDeclaringClass().getName()+"."+methods[i].getName());	
			}
		}
		
		for (int i=0; i<this.tests.size(); i++) {
			this.SetUp();
			//this.tests.get(i).setUp();
			this.tests.get(i).run(result);
			//System.out.println(result.summary());
		}
	}
}
