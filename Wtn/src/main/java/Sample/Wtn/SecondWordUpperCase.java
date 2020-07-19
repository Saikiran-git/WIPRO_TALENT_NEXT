package Sample.Wtn;

import java.util.Scanner;

public class SecondWordUpperCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		int len = input1 .length();
        String str2 = "";
        String str3 = "LESS";
        String[] str1 = new String[len];
        str1 = input1.split("\\s");
        for(int i = 0; i < len; i++){
            if(str1[0].length() == len)
                System.out.println(str3);
            str2 = str1[1].toUpperCase();
        }
        System.out.println(str2);
        sc.close();
	}

}
