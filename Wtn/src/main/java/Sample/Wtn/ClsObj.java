package Sample.Wtn;

import java.util.Scanner;

class Box {
	int l;
	int b;
	int h;
	Box(int l, int b, int h){
		this.l = l;
		this.b = b;
		this.h = h;
	}
	int Volume() {
		return l * b * h;
	}
}

public class ClsObj {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int r = sc.nextInt();
		int q = sc.nextInt();
		Box b = new Box(p, q, r);
		b.Volume();
		System.out.print(b.Volume());
		sc.close();
	}
}





/*
Create a class Box that uses a parameterized constructor to initialize the dimensions of 
a box.The dimensions of the Box are width, height, depth. The class should have a 
method that can return the volume of the box. Create an object of the Box class 
and test the functionalities.   
 
 */