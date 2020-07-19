package Sample.Wtn;

import java.util.Scanner;

class NumberGenerator{
	static int randint(int x, int y) {
		int random_int = (int)(Math.random() * (y - x + 1) + x);
		return random_int;
	}
	
	static double randdouble(double x, double y) {
		double random_int = (double)(Math.random() * (y - x + 1) + x);
		return random_int;
	}
}

public class RandomHelper {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double p = sc.nextDouble();
		double q = sc.nextDouble();
		System.out.println(NumberGenerator.randint(a, b));
		System.out.println(NumberGenerator.randdouble(p, q));
		sc.close();
	}

}


/*
 
  Create a new class called “RandomHelper” which contains the following: 
1. A static method called randint that accepts two integers and returns a
 random integer between them. Make sure that the numbers are inclusive 
 (i.e. if you call randomint(1,10) you should be able to generate both 1 and 10.
2. A static method called randdouble that accepts two integers and returns 
a random double between them. For this method you should be able to generate 
numbers such that 1 <= x < 10 for the method call randdouble(1,10)
3. Call your method from another class without instantiating the class 
(i.e. call it just like you would call Math.random() since your methods are defined to be static)
 
 */