package Sample.Wtn;

import java.util.Scanner;

class PerosnAll {
	String name;
	int id;
	char gender;
	PerosnAll(String name, int id, char gender){
		this.name = name;
		this.id = id;
		this.gender = gender;
	}
}

class StudentAll extends PerosnAll {
	StudentAll(String name, int id, char gender){
		super(name, id, gender);
	}
}

class TeacherAll extends PerosnAll {
	int salary;
	String subAll;
	TeacherAll(String name, int id, char gender, int salary, String subAll){
		super(name, id, gender);
		this.salary = salary;
		this.subAll = subAll; 
	}
	void display(){
		System.out.println(name);
		System.out.println(id);
		System.out.println(gender);
		System.out.println(salary);
		System.out.println(subAll);
	}
}

class CollageStudentAll extends StudentAll {
	int year;
	String major;
	CollageStudentAll(String name, int id, char gender, int year, String major){
		super(name, id, gender);
		this.year = year;
		this.major = major;
	}
	void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(gender);
		System.out.println(year);
		System.out.println(major);
	}
}

public class InheritanceHighSchoolApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int id = sc.nextInt();
		char gender = sc.next().charAt(0);
		int salary = sc.nextInt();
		String subAll = sc.next();
		int year = sc.nextInt();
		String major = sc.next();
		TeacherAll t = new TeacherAll(name, id, gender, salary, subAll);
		CollageStudentAll cs = new CollageStudentAll(name, id, gender, year, major);
		t.display();
		cs.display();
		sc.close();
	}

}


/*
  
 A HighSchool application has two classes: the PerosnAll superclass and the StudentAll subclass. 
 Using inheritance, in this lab you will create two new classes, TeacherAll and CollegeStudentAll. 
 A TeacherAll will be like PerosnAll but will have additional properties such as 
 salary (the amount the TeacherAll earns) and 
 subject (e.g. “Computer Science”, “Chemistry”,  “English”, “Other”). 
 The CollegeStudentAll class will extend the StudentAll class by 
 adding a year (current level in college) nd 
 major (e.g. “Electrical Engineering”, “Communications”, “Undeclared”).

 */