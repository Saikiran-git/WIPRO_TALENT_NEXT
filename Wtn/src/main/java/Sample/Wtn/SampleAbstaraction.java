package Sample.Wtn;

abstract class Shape {
	abstract void draw();
}

class Circle extends Shape{
	void draw() {
		System.out.println("drawing a circle");
	}
}

class Rectangle extends Shape{
	@Override
	void draw() {
		System.out.println("draing a rectangle");
	}
}

public class SampleAbstaraction {

	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
	}

}
