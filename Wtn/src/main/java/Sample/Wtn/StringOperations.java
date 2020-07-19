package Sample.Wtn;

import java.util.Scanner;

public class StringOperations {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = "";
		int d = str3.length();
		@SuppressWarnings("unused")
		String []str4 = new String[d];
		@SuppressWarnings("unused")
		int length = 0;;
		int num = sc.nextInt();
		char[] ch = {'h','e','l','l','o'};
		
		// To remove the spaces from either ends of the string
		// The return type is string
		String s = "	StringOP";
		System.out.println(s.trim());
		
		// Find with what character the string is starting with 
		// and the return type is boolean 
		System.out.println(str1.startsWith("a"));
		
		// Find with what character the string is ending with 
		// and the return type is boolean 
		System.out.println(str2.endsWith("n"));
		
		// Check whether the 2 strings are equal or not
		// and the return type is boolean
		System.out.println(str1.equals(str2));
		
		// This returns the character at a specific index
		// return type is char
		System.out.println(str1.charAt(1));
		
		// This compares 2 strings lexicographically
		// return type is integer
		System.out.println(str1.compareTo(str2));
		
		// This compares two strings ignoring lower case and upper case differences
		// return type is integer
		System.out.println(str1.compareToIgnoreCase(str2));
		
		// This combines two strings 
		// return type is string
		System.out.println(str1.concat(str2));
		System.out.println(str1 + str2);
		
		// This command tells us whether a string contains substring which we want
		// return type is boolean
		System.out.println((str1.contains(str2)));
		
		// This command searches a string to find out if it contains
		// the exact same sequence of characters.
		// return type is boolean
		System.out.print(str1.contentEquals(str2));
		
		// here the string that represents the characters of a char array.
		// This method returns a new String array and copies the characters into it
		// return type string
		str3 = String.copyValueOf(ch, 0, 5);
		System.out.println(str3);
		
		// this command finds the length of the string
		// return type is the integer
		System.out.println(str1.length());
		
		// this command checks whether the string is empty or not
		// return type is boolean
		System.out.println(str1.isEmpty());
		
		// this command replaces a char with a string with other char
		// return type is string
		System.out.println(str1.replace('k', 'l'));
		
		// this command converts a string with lower case char to upper case char
		// return type is string
		System.out.println(str1.toUpperCase());
		
		// this command converts a string with upper case char to lower case char
		// return type is string
		System.out.println(str1.toLowerCase());
		
		// this command converts a string to a character array
		// return type is char[]
		System.out.println(str1.toCharArray());
		
		// this command detects substring of a string from one index 
		// to other greater index
		System.out.println(str1.substring(0, str1.length()));
		
		// this command replaces the first occurrence of a substring 
		// that matches the given regular expression with the given replacement
		// return type is string
		System.out.println(str1.replace("as", "sa"));
		
		// this command replaces all the occurrences of a substring 
		// that matches the given regular expression with the given replacement
		// return type is string
		System.out.println(str1.replaceAll("as", "sk"));
		
		// this command return the hash code of a string
		// return type is integer
		System.out.println(str1.hashCode());
		
		// this command helps us to concat the 2 strings
		// returns type is the string
		System.out.println(str1.concat(str2));
		
		//this method helps us to find whether the string is empty
		// return type is boolean
		if(str1.isEmpty())
			System.out.println(str1.length());
		
		// this helps us to find the length of an integer
		// return type is integer
		length = String.valueOf(num).length();
		
		// this command helps us to convert from string to char array
		// return type is char*
		str3 = str1.concat(str2);
		str4 = new String[str3.length()];
		str4 = str3.split("\\s");
		
		//
		
		sc.close();
	}

}
