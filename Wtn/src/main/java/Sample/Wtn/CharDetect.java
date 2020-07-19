package Sample.Wtn;

import java.util.Scanner;

public class CharDetect {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
			System.out.println("Alphabet");
		else if(ch >= '0' && ch <= '9') 
			System.out.println("Number");
		else 
			System.out.println("Special Charecter");
		sc.close();
	}
}
