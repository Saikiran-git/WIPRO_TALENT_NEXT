package Sample.Wtn;

import java.util.ArrayList;

public class WrapAutoBoxing {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) { 
        char ch = 'a'; 
  
        // Autoboxing- primitive to Character object conversion 
        Character a = ch; 
  
        ArrayList<Integer> arrayList = new ArrayList<Integer>(); 
  
        // Autoboxing because ArrayList stores only objects 
        arrayList.add(25); 
  
        // printing the values from object 
        System.out.println(arrayList.get(0)); 
    }
	
}


/*
 
 Autoboxing: Automatic conversion of primitive types to the object of their 
 corresponding wrapper classes is known as autoboxing. 
 For example – conversion of int to Integer, long to Long, double to Double etc.
 
 */