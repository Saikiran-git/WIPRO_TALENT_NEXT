package Sample.Wtn;

import java.util.Scanner;

public class SumOfStableUnstable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		int input4 = sc.nextInt();
		int input5 = sc.nextInt();
		sc.close();
		int[] hash1 = new int[10]; 
		int[] hash2 = new int[10]; 
		int[] hash3 = new int[10]; 
		int[] hash4 = new int[10]; 
		int[] hash5 = new int[10]; 
		int t1 = input1,t2 = input2,t3 = input3,t4 = input4,t5 = input5; 
		int stable = 0,unstable = 0,i; 
		while(input1 > 0) { 
			hash1[input1 % 10]++; 
			input1 /= 10; 
		} 
		while(input2 > 0) { 
			hash2[input2 % 10]++; 
			input2 /= 10; 
		} 
		while(input3 > 0) { 
			hash3[input3 % 10]++; 
			input3 /= 10; 
		}
		while(input4 > 0) { 
			hash4[input4 % 10]++; 
			input4 /= 10; 
		} 
		while(input5 > 0) { 	
			hash5[input5 % 10]++; 
			input5 /= 10; 
		} 
		int c = 0; 
		for(i = 0;i < 10;i++) { 
			if(hash1[i] != 0) { 
			c = hash1[i]; 
			break; 
			} 
		} 
		for(i = 0;i < 10;i++) { 
			if(hash1[i] != 0) { 
				if(c != hash1[i]) { 
					unstable += t1; 
					break; 
				} 
			} 
		}
		if(i == 10) 
			stable += t1; 
		for(i = 0;i < 10;i++) { 
			if(hash2[i] != 0) { 
				c = hash2[i]; 
				break; 
			} 
		} 
		for(i = 0;i < 10;i++) { 
			if(hash2[i] != 0) { 
				if(c != hash2[i]) { 
					unstable += t2; 
					break; 
				} 
			} 
		} 
		if(i == 10) 
			stable += t2; 
		for(i = 0;i < 10;i++) { 
			if(hash3[i] != 0) { 
				c = hash3[i]; 
				break; 
			}
		} 
		for(i = 0;i < 10;i++){ 
			if(hash3[i] != 0) { 
				if(c != hash3[i]) { 
					unstable += t3; 
					break; 
				} 
			} 
		} 
		if(i == 10) 
			stable += t3; 
		for(i = 0;i < 10;i++) { 
			if(hash4[i] != 0) { 
				c = hash4[i]; 
				break; 
			} 
		} 
		for(i = 0;i < 10;i++) { 
			if(hash4[i] != 0) { 
				if(c != hash4[i]) { 
					unstable += t4; 
					break;
				} 
			} 
		} 
		if(i == 10) 
			stable += t4; 
		for(i = 0;i < 10;i++) { 
			if(hash5[i] != 0) { 
				c = hash5[i]; 
				break; 
			} 
		} 
		for(i = 0;i < 10;i++) { 
			if(hash5[i] != 0) { 
				if(c != hash5[i]) { 
					unstable += t5; 			
					break; 
				} 
			} 
		} 
		if(i == 10) 
			stable += t5; 
		System.out.println(stable - unstable);
	}
	
}

/*
 
given 5 numbers and find the result below
the number is stable if the count of individual numbers in a number are equal else they are unstable..
task is to print (stable - unstable) number  
  
*/
