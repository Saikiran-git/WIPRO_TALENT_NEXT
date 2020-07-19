package Sample.Wtn;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rem = 0, rev = 0, num = n;
		while(num != 0){
            rem = num % 10;
            rev= rev * 10 + rem;
            num /= 10;
        }
		if (n == rev)
            System.out.println("Palindrome.");
        else
            System.out.println("Not a palindrome.");
		sc.close();
	}
}
