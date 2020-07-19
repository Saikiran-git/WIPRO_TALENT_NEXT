package Sample.Wtn;

import java.util.Scanner;

public class PosNeg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n > 0)
			System.out.println("Positive");
		else if(n < 0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
		//the below is code using without using loops
		String[] results = {"Negative", "0", "Positive"};
		String x = results[1 + (1 + ((n + 1) % n) * ((n - 1) % n)) / n];
		System.out.println(x);
		sc.close();
	}
}
