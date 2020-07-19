package Sample.Wtn;

class Car{
	String carName;
	String carType;
	
	Car(String carName, String carType){
		this.carName = carName;
		this.carType = carType;
	}
	
	public String getcarName() {
		return carName;
	}
	
	class Engine{
		String engineType;

		protected String getEngineType() {
			return engineType;
		}

		protected void setEngineType(String engineType) {
			this.engineType = engineType;
		}
	}
}

public class ClassNestedCarMain {
	
	public static void main(String[] args) {
		Car c = new Car("BMW", "Sedan");
		System.out.println(c.getcarName());
		Car.Engine e = c.new Engine();
		e.setEngineType("Engine");
		System.out.println(e.getEngineType());
	}

}

/*
  
 Write a Java program to demonstrate Nested/Inner classes concept, by creating
an outer class Car having data fields carName, carType, and getCarName() method; and
an inner class Engine having data field engineType, and setEngineType(), getEngineType() methods.
and access outer class members with inner class by 'this' keyword.
create a CarMain class to complete the rest of the program.
  
 */
