package testpack;

public class testclass {
	public String abc;
	public int a;
	public double b;
	public testclass(String abc, int a, double b) {
		super();
		this.abc = abc;
		this.a = a;
		this.b = b;
	}
	public String getAbc() {
		return abc;
	}
	public void setAbc(String abc) {
		this.abc = abc;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	
	public static void main(String[] args) {
		System.out.println("快乐都是他们的");
		System.exit(0);
	}
	
}
