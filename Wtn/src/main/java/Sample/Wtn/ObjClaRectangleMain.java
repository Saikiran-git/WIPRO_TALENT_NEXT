package Sample.Wtn;

import java.util.Scanner;

class RectProp{
	int length;
	int breadth;
	RectProp(int l, int b){
		length = l;
		breadth = b;
	}
	
	RectProp(){
		length = 10;
		breadth = 15;
	}
	
	RectProp(int d){
		length = d;
		breadth = d;
	}
	
	int Area() {
		int a = length * breadth;
		return a;
	}
	
}

public class ObjClaRectangleMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		RectProp r = new RectProp();
		System.out.println(r.Area());
		RectProp rp = new RectProp(length);
		RectProp rp1 = new RectProp(length, breadth);
		System.out.println(rp.Area());
		System.out.println(rp1.Area());
		sc.close();
	}

}


/*
  
 Write a Java program to create a class named 'Rectangle' 
 with two data members- length and breadth
and a method to calculate the area(). The class has three constructors which are:
a. having no parameter - values of both length and breadth are assigned zero.
b. having two numbers as parameters - the two numbers are assigned as length and breadth
respectively. c. having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two 
parameters and print their areas 

 */