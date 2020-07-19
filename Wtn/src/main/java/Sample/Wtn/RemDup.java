package Sample.Wtn;

import java.util.Arrays;
import java.util.Scanner;

public class RemDup {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) 
			arr[i] = sc.nextInt();
		sc.close();
		Arrays.sort(arr);
		int cur = arr[0];
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
		    if (cur == arr[i] && !found) 
		        found = true; 
		    else if (cur != arr[i]) {
		        System.out.print(" " + cur);
		        cur = arr[i];
		        found = false;
		    } 	
		}
		System.out.print(" "+cur+" ");
	}
}
