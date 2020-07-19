package Sample.Wtn;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long rev = 0;
		 while(n != 0){
		      rev = rev * 10;
		      rev = rev + (n % 10);
		      n /= 10;
		    }
		System.out.println(rev);
		if(rev == n)
			System.out.println("YES");
		else
			System.out.println("NO");
		sc.close();
	}

}
