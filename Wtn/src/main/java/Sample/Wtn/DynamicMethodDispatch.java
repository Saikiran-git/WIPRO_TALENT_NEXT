// Project for Dynamic binding
// If u make any class as final u can't extend it


package Sample.Wtn;

class Animal1{
	void eat() {
		System.out.println("Animal Eating");
	}
}


public class DynamicMethodDispatch extends Animal1 {
	void eat() {
		System.out.println("Dog eating");
	}
	public static void main(String[] args) {
		Animal1 a = new DynamicMethodDispatch();
		a.eat();
	}

}
