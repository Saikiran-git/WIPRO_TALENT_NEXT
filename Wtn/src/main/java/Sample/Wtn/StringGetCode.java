package Sample.Wtn;

import java.util.Scanner;

public class StringGetCode {
	
	public int SCG(String input1) {
		String str[] = input1.split(" ");  
		int c = 0;
		for(int i = 0; i < str.length; i++) {
			c += str[i].length();
		}
		int x = 0;
		if(c > 0)
			x = (c % 9 == 0) ? 9 : (c % 9);
		return x;
	}
  
  	public static void main(String[] args) {
  		Scanner sc = new Scanner(System.in);
  		String sttr = sc.next() + sc.nextLine();
  		StringGetCode gcr = new StringGetCode();
  		System.out.println(gcr.SCG(sttr));
  		sc.close();
    }
  
}

/*
 
  /*
 input: wipro technologies
 explanation
 length of wipro = 5
 length of technologies = 12
 total=5+12
     =17
     =1+7
     =8
 output: 8
 */