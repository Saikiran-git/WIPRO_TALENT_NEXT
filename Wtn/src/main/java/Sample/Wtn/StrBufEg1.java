package Sample.Wtn;

import java.lang.StringBuffer;

public class StrBufEg1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		String sname = "A";
		String lname = "sk";
		sb.append(sname);
		System.out.println("Name : " +sb);
		int n = sb.length();
		sb.insert(n, lname);
		System.out.println("Full name "+sb);
		System.out.println("Reverse is "+sb.reverse());
	}

}
