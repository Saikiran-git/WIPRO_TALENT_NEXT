package Sample.Wtn;

public class StaticUsage {
	
	private static final int a = 10;
	private static final int b = 5;
	
	static int Summation(int a, int b) {
		return a + b;
	}
	
	static {
		System.out.println((a + b)+ " This is static block");
	}
	
	public static void main(String[] args) {
		int sum = 0;
		sum = a + b;
		System.out.println((sum)+" This is the static keyword");
		System.out.println((StaticUsage.Summation(a, b))+" This is the static method");
	}

}
