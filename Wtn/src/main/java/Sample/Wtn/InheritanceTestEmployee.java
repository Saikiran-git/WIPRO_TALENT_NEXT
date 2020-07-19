package Sample.Wtn;

class Person{
	protected int x = 10;
}

class Employee extends Person{
	double salary;
	int year;
	String ins_num;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getIns_num() {
		return ins_num;
	}
	public void setIns_num(String ins_num) {
		this.ins_num = ins_num;
	}
	void display() {
		System.out.println(salary);
		System.out.println(year);
		System.out.println(ins_num);
		System.out.println(x);
	}
}

public class InheritanceTestEmployee {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setSalary(1000);
		e.setYear(2020);
		e.setIns_num("654654654");
		e.display();
	}

}


/*
 
Create a class called Person with a member variable name. 
Save it in a file called Person.java

Create a class called Employee that will inherit the Person class.The other data 
members of the  Employee class are annual salary (double), the year the employee 
started to work,  and the national insurance number which is a String.Save this 
in a file called Employee.java

Your class should have the necessary constructors and getter/setter methods.

Write another class called TestEmployee, containing a main method to 
fully test your class definition.
 
 */