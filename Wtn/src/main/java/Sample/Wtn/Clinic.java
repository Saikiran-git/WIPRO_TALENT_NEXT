package Sample.Wtn;

import java.util.Scanner;

class Patient{
	String patientName;
	double height;
	double weight;
	
	Patient(String patientName, double height, double weight){
		this.patientName = patientName;
		this.height = height;
		this.weight = weight;
	}
	
	double computeBMI() {
		return weight / (height * height);
	}
	
}

public class Clinic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		double height = scanner.nextDouble();
		double weight = scanner.nextDouble();
		Patient p = new Patient(name, height, weight);
		System.out.println(p.computeBMI());
		scanner.close();
	}
}


/*
 Design a class that can be used by a health care professional
  to keep track of a patient’s vital statistics. The following are the details.
Name of the class - Patient
Member Variables - patientName(String),height(double),weight(double)
Member Function - double computeBMI()
The above method should compute the BMI and return the result. 
The formula for computation of BMI  is weight (in kg) ÷ height*height(in metres).
Create an object of the Patient class and check the results. 
 */