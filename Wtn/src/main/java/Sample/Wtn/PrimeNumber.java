package Sample.Wtn;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PrimeNumber pr = new PrimeNumber();
		int y = pr.Primes(n, 2);
		if(y == 1)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
		sc.close();
	}
	private int Primes(int z, int i) {
		if(i < z) {
			if(z % i != 0){
				return (Primes(z, ++i));
			}
			else 
				return 0;
		}
		return 1;
	}
}	
