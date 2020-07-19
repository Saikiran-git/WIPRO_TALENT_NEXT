package Sample.Wtn;

class ShapeS{
	final int length = 5;
	final int breadth = 4;
	
	final void area(){
		int a = length * breadth;
		System.out.println("Area: "+a);
	}
}

class FinalUsage{
	public static void main(String[] args){
		ShapeS obj = new ShapeS();
		obj.area();
	}
}

