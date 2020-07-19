package Sample.Wtn;

class Animals{
	void eat() {
		System.out.println("Eating");
	}
	void sleep() {
		System.out.println("Sleeping");
	}
}


class Bird extends Animals{
	@Override
	void eat() {
		System.out.println("Eating");
	}
	@Override
	void sleep() {
		System.out.println("Sleeping");
	}
	void fly() {
		System.out.println("Flying");
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		Animals b = new Animals();
		b.eat();
		b.sleep();
		Bird a = new Bird();
		a.eat();
		a.sleep();
		a.fly();
	}

}

/*
 
Create a class named ‘Animal’ which includes methods like eat() and sleep().

Create a child class of Animal named ‘Bird’ and override the parent class methods.
Add a new method named fly().

Create an instance of Animal class and invoke the eat and sleep methods using this object.

Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.  
 
 */