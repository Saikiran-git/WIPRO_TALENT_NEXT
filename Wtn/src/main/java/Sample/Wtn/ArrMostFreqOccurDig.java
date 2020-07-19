package Sample.Wtn;

import java.util.Scanner;

public class ArrMostFreqOccurDig {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []input1 = new int[n];
		for(int i = 0; i < n; i++){
			input1[i] = sc.nextInt();
		}
		sc.close();
		int [] arr = new int[10];
		int temp = 0, max = 0, num = 0;
		for(int i = 0; i < input1.length; i++){
			temp = input1[i];
			while(temp > 0){
				arr[temp % 10] += 1;
				temp /= 10;
			}
		}
		for(int j = 0; j < arr.length; j++){
			if(arr[j] > max){
				max = arr[j];
				num = j;
			}
			if(arr[j] == max){
				if(j > num){
					num = j;
					max = arr[j];
				}
			}
		}
		System.out.println(num);
	}

}
