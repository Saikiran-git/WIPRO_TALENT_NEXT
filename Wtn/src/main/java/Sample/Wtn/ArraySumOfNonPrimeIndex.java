package Sample.Wtn;

import java.util.Scanner;

public class ArraySumOfNonPrimeIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input2 = sc.nextInt();
		int input1[] = new int[input2];
		for(int i = 0; i < input2; i++) {
			input1[i] = sc.nextInt();
		}
		sc.close();
		int sum = input1[0] + input1[1]; 
		int c = 0; 
		for(int i = 3; i < input2; i++) { 
			c = 1; 
			for(int j = 2; j <= Math.sqrt(i); j++) { 
				if(i % j == 0) { 
					c = 0; 
					break; 
				} 
			} 
			if(c == 0) 
				sum += input1[i]; 
		} 
	System.out.println(sum);
	}

}
