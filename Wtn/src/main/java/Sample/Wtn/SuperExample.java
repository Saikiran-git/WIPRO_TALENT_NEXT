package Sample.Wtn;

class One {
	int i = 10;
	void show() {
		System.out.println(i);
	}
}

class Two extends One {
	int i = 20;
	void show() {
		System.out.println(i);
		System.out.println(super.i); //super variable
		super.show(); //super method
	}
}

public class SuperExample {
	public static void main(String args[]) {
		Two t = new Two();
		t.show();
	}
}
