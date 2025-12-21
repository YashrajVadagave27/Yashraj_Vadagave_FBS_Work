package Controller;

import Model.Employee;

public class EmployeeController {
	EmployeeDAO ed=new EmployeeDAO();
	
	public void addEmployee(Employee e) {
        try {
            ed.addEmployee(e);
            System.out.println("Employee added successfully!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

	public Employee searchEmployeeById(int id) {
		Employee e1=ed.searchEmployee(id);
		if(e1!=null) {
			return e1;
		}
		return null;
	}

	public boolean updateEmployee(int id, double salary) {
        try {
            ed.updateEmployee(id, salary);
            System.out.println("Employee updated!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
		return false;
    }

	public boolean deleteEmployee(int id) {
        try {
            ed.deleteEmployee(id);
            System.out.println("Employee deleted!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
		return false;
    }
	
	public void sortById() { 
		ed.sortById(); 
	}
    public void sortByName() { 
    	ed.sortByName(); 
    }
    public void sortBySalary() { 
    	ed.sortBySalary(); 
    }

	public void displayAll() {
		ed.displayAll();
		
	}

	

}
