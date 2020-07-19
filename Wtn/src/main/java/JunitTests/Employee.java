package JunitTests;

public class Employee 
{
	private String name;
	@SuppressWarnings("unused")
	private int id,sal;
	public Employee(String name,int id,int sal)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	public static String Emp()
	{
		Employee[] o=new Employee[3];
		o[0]=new Employee("Ask",1111,20000);
		o[1]=new Employee("Kiran",1112,40000);
		o[2]=new Employee("Sai",1113,30000);
		int max=0,n=0;
		for(int i=0;i<3;i++)
		{
			if(o[i].sal>max)
			{
				max=o[i].sal;
				n=i;
			}
		}
		return o[n].name;
	}
}
