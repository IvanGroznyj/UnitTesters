package FirstPackage;

import JUnitTests.TestCase;

public class WasRun extends TestCase {
	public boolean wasRun;
	public boolean wasSetUp;
	public String log;
	
	public WasRun(String name) {
		super(name);
		this.wasRun = false;
		this.wasSetUp = false;
		this.log = "";
	}
	
	public void setUp() {
		this.wasSetUp = true;
		this.wasRun = false;
		this.log = "setUp ";
	}
	
	public void tearDown() {
		this.log += "tearDown ";
	}
	
	public void testMethod() {
		this.wasRun = true;
		this.log += "testMethod ";
	}
	
	public void testWrongMethod() throws Exception {
		throw new Exception("");
	}
}
