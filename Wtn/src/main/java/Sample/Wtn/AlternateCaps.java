package Sample.Wtn;

import java.util.Scanner;

public class AlternateCaps {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		StringBuffer conv = new StringBuffer();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (i % 2 == 0) 
				c = Character.toUpperCase(c);	
			conv.append(c);
		}
		System.out.println(conv.toString());
	}
}