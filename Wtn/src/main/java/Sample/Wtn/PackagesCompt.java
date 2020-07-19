package Sample.Wtn;

public class PackagesCompt {

	int height = 10;
	int width = 10;
	int breadth = 10;
	
	void display() {
		System.out.println(height * width * breadth); 
	}
	
	public static void main(String[] args) {
		PackagesCompt c = new PackagesCompt();
		c.display();
	}

}
/*
  
 Create a class called compartment which represents the ship compartments with attributes like height, width and breadth. 

Take care it should not conflict with the compartment class you have created in Abstract class exercise 2.

To avoid conflict create this class in a new package called ur own name and store in it
 
 */