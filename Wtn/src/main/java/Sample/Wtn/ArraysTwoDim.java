package Sample.Wtn;

import java.util.Scanner;

public class ArraysTwoDim {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		int arr1[][] = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt(); 
			}
		}
		sc.close();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr1[i][j] = arr[n - i - 1][n - j - 1];
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}

}

/*
  
  00->11   
  01->10
  10->01
  11->00
  
 Write a program to reverse the elements of a given 2*2 array. 
 Four integer numbers needs to be passed as Command Line arguments.

Example1)
C:\>java Sample 1 2 3
O/P: Please enter 4 integer numbers

Example2)
C:\>java Sample 1 2 3 4
O/P: 
 The given array is :
  1 2 
  3 4 
 The reverse of the array is :
  4 3 
  2 1
  
 */
