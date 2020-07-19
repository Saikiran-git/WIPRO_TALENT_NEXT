// super is used to 

package Sample.Wtn;

class Animal {
	Animal(){
		System.out.println("animal is created");
	}
}
class Dog extends Animal{ 
	Dog(){ //dog
		super();
		System.out.print("dog is created");
	}

	public void display() {
		System.out.print("testing for the execution");
	}
}

public class ConstructorExample {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.display();
	}
}	
