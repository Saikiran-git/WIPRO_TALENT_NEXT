package Sample.Wtn;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//(n % 2 == 0) ? System.out.println("Even") : System.out.println("Odd"); 
		String[] oe = {"even", "odd"};
		System.out.println(n+ " is " + oe[n % 2]);
		sc.close();
	}
}
