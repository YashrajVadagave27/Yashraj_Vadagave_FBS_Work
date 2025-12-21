package Model;

import Model.Employee;

public class Admin extends Employee{

	double allowance;
	
	public Admin() {
		super();
        this.allowance = 250;
	}
	
	public Admin(int id, String name, double salary,double allowance) {
		super(id,name,salary);
		this.allowance = allowance;
	}
	
	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	public double calculateSalary() {
		return this.getSalary()+this.allowance;
	}

	public String toString() {
		return super.toString()+"\nCommission:"+this.allowance+"\n";
	}

}
