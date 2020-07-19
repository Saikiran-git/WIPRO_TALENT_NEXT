package Sample.Wtn;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionsNum {

	public static void main(String[] args) throws IOException, ArrayIndexOutOfBoundsException {
		Scanner sc = new Scanner(System.in);
		try {
			int n = Integer.parseInt(sc.nextLine());
			System.out.println(Math.pow(n, 2));
			System.out.println("Square");
		}
	
		catch(Exception e) {
			//System.out.println(e);
			System.out.println("java.lang.NumberFormatException");
		}
		sc.close();
	}

}

/*
 
Get an input String from user and parse it to integer, if it is not a number it will throw number 
format exception Catch it and print "Entered input is not a valid format for an integer." or else print the 
square of that number. (Refer Sample Input and Output). 

Sample input and output 1: 
Enter an integer: 12
The square value is 144
The work has been done successfully

Sample input and output 2:
Enter an integer: Java
Entered input is not a valid format for an integer.
  
 */
