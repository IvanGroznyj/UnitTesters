package JUnitTests;

public class TestResult {
	public int runCount;
	
	
	public TestResult() {
		runCount = 0;
	}
	
	public void testStarted() {
		this.runCount += 1;
	}
	
	public String summary() {
		return String.format("%d run, 0 failed", this.runCount);
	}
}
