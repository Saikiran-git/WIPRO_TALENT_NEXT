package Sample.Wtn;

import java.util.Scanner;

public class ArrayNoCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for(int i = 0; i < n; i++) 
			arr[i] = sc.nextInt();
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) 
            if (arr[i] > max + 1) 
                max = arr[i];
		int []count = new int[max + 1];
		int []v = new int[max + 1];
		for(int i = 0; i < count.length; i++) 
			count[arr[i]]++;
		int m = count[0];
		for(int i = 0; i < count.length; i++) {
			if(count[i] > m)
					m = count[i];
		}
		int j = 0;
		for(int i = 0; i < count.length; i++) {
			if(count[i] == m) {
				v[j] = count[i];
				j++;
			}
		}
		int y = v[0];
		for(int i = 0; i < v.length; i++) {
			if(v[i] > y) 
				y = v[i];
		}
		System.out.println(y);
		sc.close();
	}
}
