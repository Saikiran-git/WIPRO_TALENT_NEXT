package Sample.Wtn;

class Adder{
	static int Add(int a, int b){
		return a + b;
	}
	static int Add(int a, int b, int c){
		return a + b + c;
	}
	
}

public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println(Adder.Add(2, 5));
		System.out.println(Adder.Add(2, 5, 10));
	}

}


// overloading is used when we want to use same method name and different in number of 
// arguments and different 
// data type we need overloading and we can use any number of arguments.
// for static method there is not required of creating an object
// if no static we must create an object
