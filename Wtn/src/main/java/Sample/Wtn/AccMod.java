package Sample.Wtn;

class A {
	private int data = 40;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}

public class AccMod {
	public static void main(String[] args) {
		A obj = new A();
		System.out.println("With the getter method only i can access the data value "+obj.getData());
	}
}
