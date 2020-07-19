package Sample.Wtn;

import java.util.Properties;
public class SystemProperties {
	
	public static void main(String[] args) {
	  
	  System.out.print("Previous User Name : ");
	  System.out.println(System.getProperty("user.name"));
	  Properties p = System.getProperties();
	  p.put("user.name", "SaiKiran");
	  System.setProperties(p);
	  System.out.print("New name : ");
	  System.out.println(System.getProperty("user.name"));
  	
  	}

}