package Sample.Wtn;

import java.util.Scanner;

public class ExceptionDivision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		try {
			double div = 0.0;
			div = a / b;
			System.out.println(div);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
	}

}

/*

Write a Program with a division method which receives two integer numbers and performs the division operation. 
The method should declare that it throws ArithmeticException. This exception should be handled in the main method.  
 
 */