import java.util.*;

class Employee27 implements Comparable<Employee27> {

    int id;
    String name;
    double salary;

    public Employee27() {
        this(101, "Yashraj", 10000);
    }

    public Employee27(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }

    // compareTo() → used for sorting in ArrayList & TreeSet
    public int compareTo(Employee27 e) {
        System.out.println("compareTo() called");
        Employee27 e1 = (Employee27) e;
        return this.id - e.id;
    }

    // hashCode() → used for HashSet
    public int hashCode() {
        System.out.println("hashCode() called");
        return this.id;
    }

    // equals() → used for HashSet
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

public class ArrayListSort {

    public static void main(String[] args) {
        testArrayList();
        testHashSet();
        testTreeSet();
    }

    // ArrayList uses compareTo() when sorted
    public static void testArrayList() {
        ArrayList<Employee27> list = new ArrayList<>();
        list.add(new Employee27());
        list.add(new Employee27(103, "Raj", 50000));
        list.add(new Employee27(102, "Yash", 60000));

        Collections.sort(list);

        System.out.println("\nSorted ArrayList:");
        list.forEach(System.out::println);
    }

    // HashSet uses hashCode() + equals() (no sorting)
    public static void testHashSet() {
        HashSet<Employee27> set = new HashSet<>();
        set.add(new Employee27());
        set.add(new Employee27(103, "Raj", 50000));
        set.add(new Employee27(102, "Yash", 60000));

        ArrayList<Employee27> list = new ArrayList<>(set);
        Collections.sort(list);

        System.out.println("\nSorted HashSet (via ArrayList):");
        list.forEach(System.out::println);
    }

    // TreeSet automatically uses compareTo()
    public static void testTreeSet() {
        TreeSet<Employee27> tree = new TreeSet<>();
        tree.add(new Employee27());
        tree.add(new Employee27(103, "Raj", 50000));
        tree.add(new Employee27(102, "Yash", 60000));

        System.out.println("\nTreeSet (Auto Sorted):");
        tree.forEach(System.out::println);
    }
}
