package Sample.Wtn;

import java.util.Scanner;

public class SumOfSumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long input1 = sc.nextLong();
		sc.close();
		long rem = 0, c = 0, t = 0, sum = 0;
		while(input1 != 0){
			rem = input1 % 10;
			c = rem + t;
			input1 /= 10;
			sum += c;
			t += rem;
		}
		System.out.println(sum);
	}

}


/*
 i/p:
 654321
 o/p:
 56
 Explanation
 (6+5+4+3+2+1)+(5+4+3+2+1)+(4+3+2+1)+(3+2+1)+(2+1)+(1) 
 =56
 */