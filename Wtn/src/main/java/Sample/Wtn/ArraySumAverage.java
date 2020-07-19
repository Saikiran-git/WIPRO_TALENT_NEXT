package Sample.Wtn;

import java.util.Scanner;

public class ArraySumAverage {

	public static void main(String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		double n = sc.nextInt();
		double[] arr = new double[(int) n];
		int sum = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextDouble();
			sum += arr[i];
		}
		System.out.println("Sum is "+sum+" And average is "+(Double.valueOf(sum/n)));
		sc.close();
	}
	
}
