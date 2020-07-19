package Sample.Wtn;

import java.util.Scanner;

public class PalindromeWhenOneDigitRemoved {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		sc.close();
		/*int x = input1, c = 0, rem = 0;
		while(x != 0){
			rem = x % 10;
			c++;
			x /= 10;
		}
		int arr[] = new int[c];
		int i = 0;
		rem = 0;
		while(input1 != 0){
			rem = input1  % 10;
			arr[i] = rem;
			i++;
			input1 /= 10;
		}
		int hash[] = new int[100];
		for(int j = 0; j < x; j++){
			hash[arr[i]]++;
		}
		int d = 0;
		for(int j = 0; j < 10; j++){
			if(hash[j] % 2 == 1){
				d = j;
				break;
			}
		}
		System.out.println(d);*/
		int[] hash = new int[10]; 
		int t = input1; 
		int rem, rev = 0; 
		while(input1 > 0) { 
			rem = input1 % 10; 
			rev = rev * 10 + rem; 
			input1 /= 10; 
		} 
		if(rev == t) 
			System.out.println("-1"); 
		input1 = t; 
		while(input1 > 0) { 
			hash[input1 % 10]++; 
			input1 /= 10; 
		} 
		int ind = -1, i = 0; 
		for(i = 0; i < 10; i++){ 
			if(hash[i] % 2 == 1) { 
			ind = i; 
		} 
	} 
	System.out.println(ind);
	}

}
