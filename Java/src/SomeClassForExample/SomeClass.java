package SomeClassForExample;

public class SomeClass {
	int a=0, b=0;
	
	public SomeClass(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int Sum() {
		return a+b;
	}
	
	public int Minus() {
		return a-b;
	}
	
	public int Multiply() {
		return a*b;
	}
	
	public int GetA() {
		return a;
	}
	
	public int GetB() {
		return b;
	}
}
