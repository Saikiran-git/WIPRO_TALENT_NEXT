package Sample.Wtn;

import java.util.Scanner;

public class StringFindCode {
	int FindString(String input1) {
		String sum1 = "";
		String str = input1.toUpperCase();
		String ind[] = str.split(" "); 
		for(int i = 0; i < ind.length; i++){
			int sum = 0;
			for(int j = 0; j < ind[i].length() / 2; j++){
				int f = ind[i].charAt(j);
				int l = ind[i].charAt(ind[i].length() - 1 - j);
				sum += Math.abs(f - l);
			}
			if(ind[i].length() % 2 != 0)
				sum += (ind[i].charAt(ind[i].length() / 2) - 64);
			String str1 = Integer.toString(sum);
			sum1 += str1;
		}
		return Integer.parseInt(sum1);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next() + sc.nextLine();
		StringFindCode fs = new StringFindCode();
		System.out.println(fs.FindString(str));
		sc.close();
	}

}


/*
i/p : WORLD WIDE WEB
Method :
Step 1:
WORLD : [W-D]+[L-O]+R=40
WIDE : [W-E]+[D-I]=23
WEB : [W-B]+E=26
Step 2:
[40]+[23]+[26]
402326

o/p :402326
*/