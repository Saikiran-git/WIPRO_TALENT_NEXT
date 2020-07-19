package Sample.Wtn;

public class StringEqualOper {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		if(s1 == s2)
			System.out.println("Same");
		else
			System.out.println("Different");
		//String operation referenced are not same
		
		
		if(s1.contentEquals(s2)) //s1.equals(s2)
			System.out.println("Same");
		else
			System.out.println("Not Same");
	}
}
