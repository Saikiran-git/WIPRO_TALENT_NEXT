/*
 given the length of array and elements in array.. find the most frequent digit that occurred
 and multiply with it's frequency and print the output..
 if there are multiple elements with same frequency then consider the max element baring that 
 frequency
 if size of array i.e 'n' is <=1 print "INVALID input'
 if any element in an array is less than zero change that number to 111
 sample input
 4
 1237 262 666 140
 sample output
 24
 */

package Sample.Wtn;
import java.util.Arrays;
import java.util.Scanner;
import java.util.IntSummaryStatistics;
public class MostFrequentDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		if(n <= 1) 
			System.out.println("INVALID input");
		else {
			int []hash = new int[10];
			int rem = 0;
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				if(arr[i] < 0)
					arr[i] = 111;
				while(arr[i] != 0) {
					rem = arr[i] % 10;
					hash[rem]++;
					arr[i] /= 10;
				}
			}
			int []temp = new int[n];
			int j = 0;
			int max = Arrays.stream(hash).max().getAsInt();
			for(int i = 0; i < hash.length; i++) {
				if(hash[i] == max) {
					temp[j] = i;
					j++;
				}
			}
			IntSummaryStatistics stat = Arrays.stream(temp).summaryStatistics();
			int max1 = stat.getMax();
			System.out.println(max * max1);	
			sc.close();
		}
	}
}
