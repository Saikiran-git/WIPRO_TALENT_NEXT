package Sample.Wtn;

import java.util.Scanner;

public class NthPrimeNumber {

	public static void main(String[] args) {
		int num = 1, count = 0, i;
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		sc.close();
        while (count < input1){
        	num = num + 1;
        	for (i = 2; i <= num; i++){
            	  if (num % i == 0) {
            		  break;
            	  }
            }
            if(i == num)
            	count++;
        }
        System.out.print(num);
	}
}

// find nth prime number
