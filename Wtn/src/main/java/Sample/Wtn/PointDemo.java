package Sample.Wtn;

class Point{
	private int x = 10;
	private int y;
	/*public void setX(int x){
		this.x = (x > 79 ? 79 : (x < 0 ? 0 : x));
	}*/
	public void setY(int y){
		this.y = (y > 24 ? 24 : (y < 0 ? 0  : y));
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
}

public class PointDemo{
	public static void main(String[] args) throws java.lang.Exception{
		int a, 	b;
		Point p1 = new Point();
		//p1.setX(22);
		//System.out.println("x value is "+(p1.getX()));
		p1.setY(24);
		a = p1.getX();
		System.out.println("a is "+a );
		b = p1.getY();
		System.out.println("b is "+b);
	}
}
