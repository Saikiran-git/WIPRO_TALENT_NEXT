package Sample.Wtn;

class Persons{
	String name;
	String dob;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	void display() {
		System.out.println(name);
		System.out.println(dob);
	}
}

class Teacher extends Persons{
	int salary;
	String subject;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	void display() {
		System.out.println(name);
		System.out.println(dob);
		System.out.println(salary);
		System.out.println(subject);
	}
}

class Student extends Persons{
	int stuid;

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	void display() {
		System.out.println(name);
		System.out.println(dob);
		System.out.println(stuid);
	}
}

class College extends Persons{
	String clgname;
	int year;
	public String getClgname() {
		return clgname;
	}
	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	void display() {
		System.out.println(name);
		System.out.println(dob);
		System.out.println(clgname);
		System.out.println(year);	
	}
}

public class InheritanceSchool {

	public static void main(String[] args) {
			Teacher t = new Teacher();
			Student s = new Student();
			College c = new College();
			t.setName("Kiran");
			t.setDob("15Nov1862");
			t.setSalary(8000000);
			t.setSubject("Maths");
			s.setName("Ask");
			s.setDob("4Dec1890");
			s.setStuid(3184);
			c.setName("Sk");
			c.setDob("30Mar1799");
			c.setClgname("KLU");
			c.setYear(2);
			t.display();
			s.display();
			c.display();
	}

}


/*
  
Create a school application with a class called Persons. 
Create name and dateOfBirth as member variables.

Create a class called Teacher that inherits from the Persons class. 
The teacher will have additional properties like salary, and the subject 
that the teacher teaches.

Create a class called Student that inherits from Persons class. 
This class will have a member variable called studentId. 

Create a class called College Student that inherits from Student class. 
This class will have collegeName, the year in which the 
student is studying (first/second/third/fourth) etc.

Create objects of each of this classes, invoke and test the methods that are 
available in these classes.
  
 */
