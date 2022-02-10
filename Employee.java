
public class Employee {

	private int id;
	private String name;
	private double salary;
	
	public Employee(int a,String nm,double sal)
	{
		id=a;
		name=nm;
		salary=sal;
		//constructor created
	}
	
	public void showemps()
	{
		System.out.println("Name :"+name);
		System.out.println("ID :"+id);
		System.out.println("Salary :"+salary);
	System.out.println("helllloooooo");
	}
	
	public String getName()
	{
		
		return name;
	}
	
	public String getName1()
	{
		if(salary>20000)
			//System.out.print();
			return "Name :"+name;
		return "  ";
	}
	
	
	
	
	
	
	
	
	
	
}
