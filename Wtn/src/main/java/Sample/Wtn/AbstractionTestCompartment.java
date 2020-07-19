package Sample.Wtn;

abstract class Compartment{
	
	public abstract String notice();

}

class FirstClass extends Compartment {
	
	@Override
	public String notice() {
		return "First Class";
	}
	
}

class Ladies extends Compartment{

	@Override
	public String notice() {
		return "Ladies";
	}
	
}

class General extends Compartment{
	
	@Override
	public String notice() {
		return "General";
	}
}

class Luggage extends Compartment{
	
	@Override
	public String notice() {
		return "Luggage";
	}
}


public class AbstractionTestCompartment {
	
	public static void main(String[] args) {
		int compt[] = new int[10];
		FirstClass fc = new FirstClass();
		Ladies l = new Ladies();
		General g = new General();
		Luggage lg = new Luggage();
		for(int i = 0; i < 10; i++) {
			compt[i] = (int) (Math.random() * 5);
			if(compt[i] == 1)
				System.out.println(lg.notice());
			if(compt[i] == 2)
				System.out.println(l.notice());
			if(compt[i] == 3)
				System.out.println(fc.notice());
			if(compt[i] == 4)
				System.out.println(g.notice());
		}
	}
	
}


/*
 
Create an abstract class Compartment to represent a rail coach.
Provide an abstract function notice in this class. 

public abstract String notice();

Derive FirstClass, Ladies, General, Luggage classes from the compartment class. 
Override the notice function in each of them to print notice message 
that is suitable to the specific type of  compartment.

Create a class TestCompartment.Write main function to do the following:
Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
Check the polymorphic behavior of the notice method.
[i.e based on the random  number genererated, the first compartment can be Luggage, 
the second one could be Ladies and so on..] 
 
 */