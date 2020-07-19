package Sample.Wtn;

import java.util.Scanner;

public class IsPalindromePossible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int length = String.valueOf(input1).length();
	    int a[] = new int[10];
	    int rem = 0;
	    while(input1 != 0){
	      rem = input1 % 10;
	      a[rem]++;
	      input1 /= 10;
	    }
	    int c = 0;
	    for(int i = 0; i < a.length; i++){
	      if(a[i] % 2 == 0 && a[i] != 0)
	    	  c++;
	      if(a[i] > 2 && a[i] % 2 != 0)
	    	  c += a[i] / 2;
	    }
	    System.out.println(c);
	    if(c == length / 2)
	    	System.out.println("1");
	    else
	    	System.out.println("2");
	    sc.close();
	}

}
