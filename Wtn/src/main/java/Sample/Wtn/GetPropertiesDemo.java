package Sample.Wtn;

import java.util.*;

public class GetPropertiesDemo {

	public static void main(String[] args) {
		Properties x = System.getProperties();
		x.list(System.out);
	}

}


// you will get the properties of the java and the jar files which we are using , the 
// version, oracle etc as the output
