package Sample.Wtn;

import java.util.Scanner;

public class StringsAddition {
	public String assstr(String input1,String input2) {
		if(input1.length() > input2.length()){
			String t = input1;
			input1 = input2;
			input2 = t;
		}  
		String str = "";
		int n1 = input1.length();
		int n2 = input2.length();
		input1 = new StringBuilder(input1).reverse().toString();
		input2 = new StringBuilder(input2).reverse().toString();
		int carry = 0;
		for(int i = 0; i < n1; i++){
			int sum = ((int)(input1.charAt(i) - '0') + (int)(input2.charAt(i) - '0') + carry);
			str += (char)(sum % 10 + '0');
			carry = sum / 10;
		}
		for(int i = n1; i < n2; i++){
			int sum = ((int)(input2.charAt(i) - '0') + carry);
			str += (char)(sum % 10 + '0');
			carry = sum / 10;
		}
		if(carry > 0)
			str += (char)(carry + '0');
		str = new StringBuilder(str).reverse().toString();
		return str;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		StringsAddition aus=new StringsAddition();
		System.out.println(aus.assstr(s1,s2));
		sc.close();
	}
	
}


/* input : 1265184984 + 6549849164
Explanation: 
1265184984 + 6549849164 = 7815034148
output : 1290
*/