package Sample.Wtn;

public class FanProperties {
	static int SLOW = 1;
	static int MEDIUM = 2;
	static int FAST = 3;
	private int speed;
	private boolean ON;
	private double radius;
	private String color;
	FanProperties(){
		speed = SLOW;
		ON = false;
		radius = 5;
		color = "red";
		
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isON() {
		return ON;
	}
	public void setON(boolean oN) {
		ON = oN;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void tostr() {
		System.out.println(SLOW);
		System.out.println(MEDIUM);
		System.out.println(FAST);
		System.out.println(speed);
		System.out.println(ON);
		System.out.println(radius);
		System.out.println(color);
	}
		
	public static void main(String[] args) {
		FanProperties fp =  new FanProperties();
		FanProperties fp1 =  new FanProperties();
		fp.setSpeed(FAST);
		fp.setON(true);
		fp.setRadius(5);
		fp.setColor("red");
		fp1.tostr();
		fp.tostr();
	}

}


/*
  
Design a class that implements a Fan. Here’s what your class should contain: 
1. Static constants SLOW, MEDIUM and FAST that store the integers 1, 2 and 3
2. Private int named speed that defaults to SLOW
3. Private boolean named on that defaults to false
4. Private double named radius that defaults to 5
5. Private String named color that defaults to “red”
6. A no-arg constructor
7. Getters and setters for each field, making sure to perform appropriate data 
	vaildation prior to making changes to any field
8. A method toString() that returns a String summary of the current status of your fan

 */