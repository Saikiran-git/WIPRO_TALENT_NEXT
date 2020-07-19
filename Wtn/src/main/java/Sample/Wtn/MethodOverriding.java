package Sample.Wtn;

class RBI{
	int getRateOfInterest() {
		return 0;
	}
	void display() {
		System.out.print("you are in RBI policy");
	}
}

class SBI extends RBI{
	@Override
	int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends RBI {
	int getRateOfInterest() {
		return 9;
	}
}


public class MethodOverriding {

	public static void main(String[] args) {
		/*SBI obj = new SBI();
		int val = obj.getRateOfInterest();
		System.out.println(val);
		obj.display();*/
		RBI obj;
		obj = new SBI();
		System.out.print(obj.getRateOfInterest());
	}

}


// Overriding is the subclass/child class has same method declared 
// in the parent class/super class.
// parent is having method and same is available in child class
// if we create object using the children class so the parent class method will be 
// over ridden by child class