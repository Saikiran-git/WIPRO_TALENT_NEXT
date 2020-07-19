package Sample.Wtn;

import java.util.Scanner;

public class ArraySucceedSixSeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int six = 0, seven = 0, sum = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			if(arr[i] == 6)
				six = i;
			if(arr[i] == 7)
				seven = i;
		}
		if(seven - six < 0) {
			System.out.println(sum);
		}
		else {
			sum = 0;
			for(int i = 0; i < six; i++) {
				sum += arr[i];
			}
			for(int i = seven + 1; i < arr.length; i++) {
				sum += arr[i];
			}
			System.out.println(sum);
		}
		sc.close();
	}

}


/*
 
Write a program to print the sum of the elements of an array following the given below condition.

If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the 
other numbers for calculation of sum.

Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22   
[i.e 10+3+9]

Eg2) Array Elements - 7,1,2,3,6
O/P:19

Eg3) Array Elements - 1,6,4,7,9
O/P:10
  
 */