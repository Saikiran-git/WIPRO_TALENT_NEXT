package Sample.Wtn;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int c = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == s.charAt(s.length() - i - 1))
				c++;
			else
				break;
		}
		if(c == s.length())
			System.out.println("Palindrome");
		else
			System.out.print("Not palindrome");
		sc.close();
	}
}
