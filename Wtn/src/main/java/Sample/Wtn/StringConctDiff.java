package Sample.Wtn;

import java.util.Scanner;

public class StringConctDiff {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = "";
		  if(str1.length() > 0 && str2.length() > 0){
			  if(str1.charAt(str1.length() - 1) == str2.charAt(0))
				  System.out.println(str1 + str2.substring(1, str2.length()));
			  else{
				  str3 = str1.concat(str2);
				  System.out.println(str3);
				}
		  }
		  else
			  System.out.println(str1 + str2);
		sc.close();
	}
}


/*
 import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int l1=s1.length();
        int l2=s2.length();
        if(s1.charAt(l1-1)==s2.charAt(0))
        System.out.println(s1+s2.substring(1,l2));
        else
        System.out.println(s1+s2);
    }
}
*/
 