import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

class Employee {
	int id;
	String name;
	double salary;
	
	public Employee() {
		this.id = 101;
		this.name = "Yashraj";
		this.salary = 10000;
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "ID:"+this.id +"\nName: "
				+this.name+"\nSalary: "+
				this.salary;
	}
	
}

class TestCollection{
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee(102, "Raj", 50000);
		Employee e3 = new Employee(103, "Yash", 60000);
		
		//List l1 = new ArrayList();
		List l1 = new LinkedList();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		
		System.out.println(l1);
		
	}
}