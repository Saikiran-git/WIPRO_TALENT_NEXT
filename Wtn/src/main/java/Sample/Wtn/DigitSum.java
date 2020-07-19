package Sample.Wtn;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		if(input1 > 0) {
			int ans = (input1 % 9 == 0) ? 9 : (input1 % 9);
			System.out.print(ans);
		}
		else if(input1 == 0)
			System.out.println("0");
		else{
		    input1 = -1 * input1;
		   	int x = (input1 % 9 == 0) ? 9 : (input1 % 9);
		   	System.out.println(-1 * x);
		}
		sc.close();
	}

}
// sum of digits in a number until the sum is resulted to single digit
