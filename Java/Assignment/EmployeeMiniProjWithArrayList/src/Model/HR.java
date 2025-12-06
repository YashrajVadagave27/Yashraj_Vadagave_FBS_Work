package Model;

import Model.Employee;

public class HR extends Employee{

	double commission;
	
	public HR() {
		super();
		this.commission = 0;
	}
	
	public HR(int id, String name, double salary,double commission) {
		super(id,name,salary);
		this.commission = commission;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public String toString() {		
		return super.toString()+"/ncommission:" + commission;
	}

	public double calculateSalary() {
		return this.getSalary()+this.commission;
	}

}
