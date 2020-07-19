package Sample.Wtn;

class Parent{
	static int x = 10;
}

class Child extends Parent{
	void display(){
		System.out.println(x);
	}
}

public class InheritanceParentChild {

	public static void main(String[] args) {
		Child c = new Child();
		c.display();
	}
		
}


/*
 
Declare one same variable in both parent 
and child class and try to access the variable 
of parent class in child class.

 */