package Sample.Wtn;

import java.util.Scanner;

public class MostFreqDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		int input4 = sc.nextInt();
		int arr[] = {input1, input2, input3, input4};
        int temp[] = new int[10];
        int num;
        for(int i = 0; i < arr.length; i++){   
        	num = arr[i];
            while(num != 0){
                int rem = num % 10;
                temp[rem]++;
                num /= 10;
            }
        }
        int max = -1;
        int x = 0;
        for(int i = 0 ; i < temp.length; i++){
            if(temp[i] >= max){
                max = temp[i];
                x = i;
            }
        }
        System.out.println(x);
		sc.close();
	}
}

/*
 Find the most frequent digit of given 4 inputs , if there are more than 1 digit
 print max of those all digits
 */
