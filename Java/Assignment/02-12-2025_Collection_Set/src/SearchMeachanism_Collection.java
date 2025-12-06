import java.util.*;

class Employee3 implements Comparable {

    int id;
    String name;
    double salary;

    public Employee3() {
        this.id = 101;
        this.name = "Yashraj";
        this.salary = 10000;
    }

    public Employee3(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nSalary: " + salary+"\n----------------------\n";
    }

    public int compareTo(Object o1) {
    	System.out.println("Inside compareTo");
        Employee3 emp = (Employee3) o1; // direct casting
        return this.id - emp.id;        // ascending order by id
    }
    
    public int hashCode() {
    	System.out.println("Inside hashcode");
        return this.id;       
    }
    
    public boolean equals(Object o1) {
    	System.out.println("Inside equals");
    	Employee3 e1 = (Employee3)o1;
        if(this.id == e1.id) {
        	return true;
        }else {
        	return false;
        }      	
    }
}

public class SearchMeachanism_Collection {
//	public static void main(String[] args) {
//
//        ArrayList<Employee3> ts = new ArrayList<Employee3>(); // it directly use compareto to search
//
//        ts.add(new Employee3());
//        ts.add(new Employee3(103, "Raj", 50000));
//        ts.add(new Employee3(102, "Yash", 60000));
//        
//        int flag=0;
//        for(int i=0; i<ts.size();i++) {
//        	if(ts.get(i).getId() == 101) {
//        		System.out.println("Found");
//        		flag=1;
//        		break;
//        	}
//        }
//        if(flag==0) {
//        	System.out.println("Not Found");
//        }

//        for(Employee2 e : ts)	//for each employee e in list ts
//        {
//        	if(e.getId() == 101) {
//        		System.out.println("Found");
//        		flag=1;
//        		break;
//        	}
//        }
//        if(flag==0) {
//        	System.out.println("Not Found");
//        }
        
        
//        if(ts.contains(new Employee3(103, "Raj", 50000))) {
//        	System.out.println("Found");      	
//        }else {
//        	System.out.println("Not Found");
//        }
//    }
	
	public static void main(String[] args) {

        HashSet<Employee3> ts = new HashSet<Employee3>();	// it directly use hashcode and equals to search

        ts.add(new Employee3());
        ts.add(new Employee3(103, "Raj", 50000));
        ts.add(new Employee3(102, "Yash", 60000));

        if(ts.contains(new Employee3(103, "Raj", 50000))) {
        	System.out.println("Found");      	
        }else {
        	System.out.println("Not Found");
        }
    }
	
//    public static void main(String[] args) {
//
//        TreeSet<Employee3> ts = new TreeSet<Employee3>(); // it directly use compareto to search
//
//        ts.add(new Employee3());
//        ts.add(new Employee3(103, "Raj", 50000));
//        ts.add(new Employee3(102, "Yash", 60000));
//
//        if(ts.contains(new Employee3(103, "Raj", 50000))) {
//        	System.out.println("Found");      	
//        }else {
//        	System.out.println("Not Found");
//        }
//    }
}
