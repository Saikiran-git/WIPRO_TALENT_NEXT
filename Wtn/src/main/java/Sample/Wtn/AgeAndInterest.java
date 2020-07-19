package Sample.Wtn;

public class AgeAndInterest {
	public static void main(String[] args) {
		String gend = args[0];
		int age = Integer.parseInt(args[1]);
		if(gend.startsWith("F")){
			if(age >= 1 && age <= 58) 
				System.out.println("8.2%");
			else
				System.out.println("7.6%");
		}
		else {
			if(age <= 60 && age >= 1) 
				System.out.println("9.2%");
			else
				System.out.println("8.3%");
		}
		
	}
}
