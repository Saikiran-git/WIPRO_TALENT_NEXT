package Sample.Wtn;

import java.util.Scanner;

public class EvenOrOddDigitSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		String input2 = sc.next();
		int rem = 0, sum = 0, sum1 = 0;
	    while(input1 != 0){
	      rem = input1 % 10;
	      if(rem % 2 == 0)
	      sum += rem;
	    if(rem % 2 != 0)
	      sum1 += rem;
	      input1 /= 10;
	    }
	  if(input2.equals("odd"))
		  System.out.println(sum1);
	  else
		  System.out.println(sum);
		sc.close();
	}
}	

/*
 if the given input string is even print the sum of even digits of a number else odd. 
 */
