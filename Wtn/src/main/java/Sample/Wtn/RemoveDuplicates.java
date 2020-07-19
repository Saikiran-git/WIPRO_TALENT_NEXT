package Sample.Wtn;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int dup[] = new int[n];
		for(int i = 0; i < n; i++) 
			arr[i] = sc.nextInt();
		int j = 0;
		Arrays.sort(arr);
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] != arr[i + 1]) {
				dup[j] = arr[i];
				j++;
				dup[j] = arr[i + 1];
				j++;
			}
			if(arr[i] == arr[i + 1]) {
				dup[j++] = arr[i];
				j++;
			}
		}
		for(int i : dup) {
			System.out.print(dup[i]+" ");
		}
		sc.close();
	}
}
