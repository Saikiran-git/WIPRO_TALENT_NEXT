package Sample.Wtn;

import java.util.Scanner;

public class FloydPattern {
	public static void main(String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, j;  
		for (i = 0; i < n; i++ ){
            for (j = 0; j <= i; j++)
                System.out.print("*" + " ");
            System.out.println();
        } 
		sc.close(); 
	}
}
