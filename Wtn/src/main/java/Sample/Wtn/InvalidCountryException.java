package Sample.Wtn;

@SuppressWarnings("serial")
public class InvalidCountryException extends Exception {
	
	//super();
	InvalidCountryException(){
		System.out.println("User Outside India  cannot be registered");
	}
}
