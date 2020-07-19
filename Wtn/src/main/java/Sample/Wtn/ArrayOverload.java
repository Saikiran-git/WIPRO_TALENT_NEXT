package Sample.Wtn;

import java.util.Scanner;

public class ArrayOverload {

	static void Arrays(int intArr[], int n) {
		for(int i : intArr) {
			System.out.println(i);
		}
	}
	
	static void Arrays(double doubArr[], int n) {
		for(double i : doubArr) {
			System.out.println(i);
		}
	}
	
	static void Arrays(String strArr[], int n) {
		for(String i : strArr) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] intArr = new int[n];
		double [] doubArr = new double[n];
		String [] strArr = new String[n];
		for(int i = 0; i < n; i++) {
			intArr[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			doubArr[i] = sc.nextDouble();
		}
		for(int i = 0; i < n; i++) {
			strArr[i] = sc.next();
		}
		ArrayOverload.Arrays(intArr, n);
		ArrayOverload.Arrays(doubArr, n);
		ArrayOverload.Arrays(strArr, n);
		sc.close();
	}

}


/*
 
 Write a program and use overloaded methods
 for printing different types of array (integer, double and character). 
 
 */