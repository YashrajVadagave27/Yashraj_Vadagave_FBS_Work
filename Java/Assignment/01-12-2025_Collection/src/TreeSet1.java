import java.util.TreeSet;

class Employee1 implements Comparable {

    int id;
    String name;
    double salary;

    public Employee1() {
        this.id = 101;
        this.name = "Yashraj";
        this.salary = 10000;
    }

    public Employee1(int id, String name, double salary) {
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

    // compareTo using Object (NO instanceof used)
    @Override
    public int compareTo(Object o1) {
        Employee1 emp = (Employee1) o1; // direct casting
        return this.id - emp.id;        // ascending order by id
    }
}

public class TreeSet1 {
    public static void main(String[] args) {

        Employee1 e1 = new Employee1();
        Employee1 e2 = new Employee1(103, "Raj", 50000);
        Employee1 e3 = new Employee1(102, "Yash", 60000);

        TreeSet<Employee1> ts = new TreeSet<Employee1>();

        ts.add(e1);
        ts.add(e2);
        ts.add(e3);

        System.out.println(ts);
    }
}
