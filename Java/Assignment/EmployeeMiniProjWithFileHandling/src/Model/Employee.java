package Model;

import java.io.Serializable;

public abstract class Employee implements Serializable, Comparable<Employee>{
	int id;
	String name;
	double salary;
	
	public Employee() {
		this.id = 0;
		this.name = "Not Given";
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
		if(salary <= 0) {
			throw new IllegalArgumentException("Salary must be positive");
		}
		this.salary = salary;
	}
	public abstract double calculateSalary(); 

	public int compareTo(Employee e) {
		return this.id - e.id;
	}
	
	public String toString() {
		return "ID:"+this.id +"\nName: "
				+this.name+"\nSalary: "+
				this.salary;
	}
	
}
