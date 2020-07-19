package Sample.Wtn;

import java.util.Scanner;

public class Calculator {
	
	static int powerInt(int num1,int num2) {
		return (int) Math.pow(num1, num2);
	}
	
	static double powerDouble(double num1,int num2) {
		return Math.pow(num1, num2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double c = sc.nextDouble();
		System.out.println(Calculator.powerInt(a, b));
		System.out.println(Calculator.powerDouble(c, b));
		sc.close();
	}
}


/*
 Create a new class called Calculator with the following methods: 
1. A static method called powerInt(int num1,int num2)
This method should return num1 to the power num2.
2. A static method called powerDouble(double num1,int num2).
This method should return num1 to the power num2.
3. Invoke both the methods and test the functionalities.
Hint: Use Math.pow(double,double) to calculate the power.
 */
 