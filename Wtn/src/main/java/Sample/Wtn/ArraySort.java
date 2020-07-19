package Sample.Wtn;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) 
			arr[i] = sc.nextInt();
		Arrays.sort(arr);
		int x = sc.nextInt();
		//to search an element in the array
		int index = Arrays.binarySearch(arr, x);
		System.out.println(index);
		for(int i : arr) {
			System.out.print(i+"\t");
		}
		sc.close();
	}
}
