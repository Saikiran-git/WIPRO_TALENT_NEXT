package Sample.Wtn;

import java.util.Scanner;

public class ArrayMaxMinTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close(); 
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			boolean swap = false;
			int j = 0;
			while(j < n - 1) {
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swap = true;
				}
				j++;
			}
			if( !swap)
				break;
		}
		System.out.println("Min are " +arr[0]+ " and " +arr[1]);
		System.out.println("Max are " +arr[n - 1]+ " and " +arr[n - 2]);
	}

}
