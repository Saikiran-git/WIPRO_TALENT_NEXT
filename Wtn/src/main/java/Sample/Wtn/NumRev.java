package Sample.Wtn;

import java.util.Scanner;

public class NumRev {
	public static void main(String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;
		 while(n != 0){
		      rev = rev * 10;
		      rev = rev + (n % 10);
		      n /= 10;
		    }
		System.out.println(rev);
		sc.close();
	}

}
