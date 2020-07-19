package Sample.Wtn;

class ShapesDo{
	void draw() {
		System.out.println("tri, cir, sq -> draw");
	}
	
	void erase() {
		System.out.println("tri, cir, sq -> erase");
	}	
}

class Triangle extends ShapesDo{
	void draw() {
		System.out.println("Draw a triangle");
	}
	
	void erase() {
		System.out.println("Erase a triangle");
	}
}

class CircleDo extends ShapesDo{
	void draw() {
		System.out.println("Draw a cicle");
	}
	
	void erase() {
		System.out.println("Erase a CircleDo");
	}
}

class Square extends ShapesDo{
	void draw() {
		System.out.println("Draw a square");
	}
	
	void erase() {
		System.out.println("Erase a square");
	}
}

public class ShapesFig {
	
	public static void main(String[] args) {
		Triangle tr = new Triangle();
		CircleDo cl = new CircleDo();
		Square sq = new Square();
		tr.draw(); tr.erase();
		cl.draw(); cl.erase();
		sq.draw(); sq.erase();
	}

}


/*
  
 Write a program to create a class named ShapesDo. In this class we have three sub classes CircleDo, 
 triangle and square each class has two member function named draw () and erase ().
  Create these using polymorphism concepts 

 */