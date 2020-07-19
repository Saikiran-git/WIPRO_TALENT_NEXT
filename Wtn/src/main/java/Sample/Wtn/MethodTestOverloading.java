package Sample.Wtn;

import java.util.Scanner;

public class MethodTestOverloading {
	
	int MaxOfTwoInt(int a, int b) {
		return Math.max(a, b);
	}
	
	double MaxOfTwoDoubles(double c, double d) {
		return Math.max(c, d);
	}
	
	double MaxOfThreeDoubles(double c, double d, double x) {
		double z = 0.0;
		z = (c > d) ? c : d;
		return Math.max(z, x);
	}
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			double x = sc.nextDouble();
			sc.close();
			MethodTestOverloading m = new MethodTestOverloading();
			System.out.println(m.MaxOfTwoInt(a, b));
			System.out.println(m.MaxOfTwoDoubles(c, d));
			System.out.println(m.MaxOfThreeDoubles(c, d, x));
	}

}

/*
Write a Java program to find the maximum number of two integer values, 
two double values and three
double values by using method overloading mechanism.
*/