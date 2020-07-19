package Sample.Wtn;
import java.util.Scanner;

public class ExceptionTwoStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {
			String name = "";
			int sub1 = 0;
			int sub2 = 0;
			int sub3 = 0;
			
			try {				
				name = sc.nextLine();
				if (sc.hasNextInt())
					sub1 = sc.nextInt();
				else
					throw new NumberFormatException();
				
				if (sc.hasNextInt())
					sub2 = sc.nextInt();
				else
					throw new NumberFormatException();
				
				if (sc.hasNextInt())
					sub3 = sc.nextInt();
				else
					throw new NumberFormatException();
				
				if (sub1 < 0)
					throw new NegativeValuesException();
				if (sub1 > 100)
					throw new ValuesOutOfRangeException();
				
				if (sub2 < 0)
					throw new NegativeValuesException();
				if (sub2 > 100)
					throw new ValuesOutOfRangeException();
				
				if (sub3 < 0)
					throw new NegativeValuesException();
				if (sub3 > 100)
					throw new ValuesOutOfRangeException();
				
				
			} 
			catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			catch (NegativeValuesException e) {
				System.out.println(e.getMessage());
			} 
			catch (ValuesOutOfRangeException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("Name: " + name);
			System.out.println("Marks of subject 1: " + sub1);
			System.out.println("Marks of subject 2: " + sub2);
			System.out.println("Marks of subject 3: " + sub3);
		}
		
		sc.close();

	}

}

/*
 in this package NegativeValuesException and ValuesOutOfRangeException are interlinked classes..
  
*/


/*
 
 Write a Program to take care of Number Format Exception if user enters values other than integer for calculating average
  marks of 2 students. The name of the students and marks in 3 subjects are taken from the user while executing the program.
In the same Program write your own Exception classes to take care of Negative values and values out of range 
(i.e. other than in the range of 0-100)
  
*/
