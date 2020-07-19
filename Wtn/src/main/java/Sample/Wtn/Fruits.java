package Sample.Wtn;

import java.util.Scanner;

class FruitProp{
	String name;
	String taste;
	int size;
	FruitProp(String name, String taste, int size){
		this.name = name;
		this.taste = taste;
		this.size = size;
	}
	
	void eat() {
		System.out.println(name);
		System.out.println(taste);
	}
}

class Apple extends FruitProp{
	Apple(String name, String taste, int size) {
		super(name, taste, size);
	}

	@Override
	void eat() {
		System.out.println("Apple tastes good and size is 5");
	}

}

class Orange extends FruitProp{
	Orange(String name, String taste, int size) {
		super(name, taste, size);
	}
	
	@Override
	void eat() {
		System.out.println("Orange also tastes good and size is 5");
	}
	
}

public class Fruits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String taste = sc.next();
		int size = sc.nextInt();
		Apple ap = new Apple(name, taste, size);
		Orange or = new Orange(name, taste, size);
		ap.eat();
		or.eat();
		sc.close();
	}

}

/*
 
 Create  a base class Fruit which has name ,taste and size as its attributes.
  A method called eat() is created which describes the name of the fruit and its taste.  
  Inherit the same in 2 other class Apple and Orange and override the eat() method 
  to represent each fruit taste.

 */