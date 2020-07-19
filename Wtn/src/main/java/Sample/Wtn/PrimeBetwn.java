package Sample.Wtn;

import java.util.Scanner;

public class PrimeBetwn {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (a < b) {
            boolean f = false;
            for(int i = 2; i <= a / 2; ++i) {
                if(a % i == 0) {
                    f = true;
                    break;
                }
            }
            if (!f && a != 0 && a != 1)
                System.out.print(a + " ");

            ++a;
        }
        sc.close();
    }
}
