package Sample.Wtn;

import java.util.Scanner;

class PatientMan{
	String name;
	double height;
	double weight;
	PatientMan(String name, double height, double weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	static double Hgt() {
		int x = 4;
		int y = 7;
		double height = (double) (Math.random() * (y - x + 1) + x);
		return height * 12; //convert to inches
	}
	
	static double Wgt() {
		int x = 45;
		int y = 80;
		double weight = (double) (Math.random() * (y - x + 1) + x);
		return weight * 2.2; //convert to pounds
	}
	
	final double Bmi() {
		double res = 0;
		res = ((weight) / (height * height)) * 703;
		return res;
	}
	
}

public class ClassObjConstruClinic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PatientMan []p = new PatientMan[n];
		for(int i = 0; i < n; i++) {
			String name = sc.next();
			double height = PatientMan.Hgt();
			double weight = PatientMan.Wgt();
			p[i] = new PatientMan(name, height, weight);
		}
		for(int i = 0; i < n; i++) {
			if(p[i].Bmi() > 25.0)
				System.out.println(p[i].name+ " " +p[i].height+ " " +p[i].weight+ " "+p[i].Bmi());
			else
				System.out.println(p[i].name+" record doesn't exists");
		}
		sc.close();
	}

}



/*
  
 Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. 
 Here’s what the class should do: 
1. Construct a class called Patient
2. Store a String name for the patient
3. Store weight and height for patient as doubles
4. Construct a new patient using these values
5. Write a method called BMI which returns the patient’s BMI as a double. 
BMI can be calculated as BMI = ( Weight in Pounds / ( Height in inches x Height in inches ) ) x 703
6. Next, construct a class called “Patients” that creates 10 patients and stores them in an array.
 Default each patient to a random height and weight. Iterate over the array and 
 report all patient’s who’s BMI is over 25.0
  
 */