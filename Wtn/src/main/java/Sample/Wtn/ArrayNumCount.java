package Sample.Wtn;

import java.util.Scanner;

public class ArrayNumCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		int []count = new int[10];
		for(int i = 0; i < n; i++) 
			arr[i] = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int v = 0, rem = 0;
			v = arr[i];
			while(v > 0){
				rem = v % 10;
				count[rem]++;
				v /= 10;
			}
		}
		for(int i = 0; i < count.length; i++) {
			System.out.println(i+" occured "+count[i]+" times");
		}
		sc.close();
	}
}
