package Sample.Wtn;

class Student2{
	int id;
	double cgpa;
	Student2(int id, double cgpa){
		this.id = id;
		this.cgpa= cgpa;
	}
}

public class ArrayOfObj {

	public static void main(String[] args) {
		//Student obj = new Student(49, 8.0);
		//System.out.println(obj.id+ " " +obj.cgpa);
		Student2 []s = new Student2[10];
		s[0] = new Student2(101, 8.5);
		s[1] = new Student2(185, 8.4);
		for(int i = 0; i < 2; i++) {
			System.out.println(s[i].id+ " " +s[i].cgpa);
		}
	}

}
