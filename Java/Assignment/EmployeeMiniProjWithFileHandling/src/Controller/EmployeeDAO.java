package Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.io.*;

import Model.*;

public class EmployeeDAO {

    static ArrayList<Employee> eArr;

    static {
    	eArr = new ArrayList<>();
        loadFromFile();

        if (eArr == null || eArr.isEmpty()) {
            eArr = new ArrayList<>();
            eArr.add(new HR(101, "Ranjit", 50000, 5000));
            eArr.add(new HR(102, "Amit", 48000, 4500));
            eArr.add(new HR(103, "Sneha", 47000, 4000));
            eArr.add(new SalesManager(201, "Karan", 60000, 12, 8000));
            eArr.add(new SalesManager(202, "Meena", 58000, 15, 7500));
            eArr.add(new SalesManager(203, "Rohit", 62000, 10, 9000));
            eArr.add(new Admin(301, "Pragati", 70000, 10000));
            eArr.add(new Admin(302, "Isha", 68000, 9500));
            eArr.add(new Admin(303, "Pooja", 72000, 11000));
            eArr.add(new Admin(304, "Shubham", 75000, 12000));
            saveToFile();
        }
    }

    public boolean addEmployee(Employee e) {
        if (searchEmployee(e.getId()) != null)
            throw new IllegalArgumentException("Employee ID already exists");

        eArr.add(e);
        saveToFile();
        return true;
    }

    public Employee searchEmployee(int id) {
        for (Employee emp : eArr) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    public boolean updateEmployee(int id, double salary) {
        for (Employee emp : eArr) {
            if (emp.getId() == id) {
                emp.setSalary(salary);
                saveToFile();
                return true;
            }
        }
        throw new NoSuchElementException("Employee not found");
    }

    public boolean deleteEmployee(int id) {
        for (int i = 0; i < eArr.size(); i++) {
            if (eArr.get(i).getId() == id) {
                eArr.remove(i);   // safe removal
                saveToFile();
                return true;
            }
        }
        throw new NoSuchElementException("Employee not found");
    }

    public void sortById() { 
    	Collections.sort(eArr); 
    	System.out.println("Sort By Id\n\n"+eArr);
    }
    public void sortByName() {
    	Collections.sort(eArr, new SortByName()); 
    	System.out.println("Sort By Name\n\n"+eArr);
    }
    public void sortBySalary() { 
    	Collections.sort(eArr, new SortBySalary()); 
    	System.out.println("Sort By Salary\n\n"+eArr);
    }
    
    public void displayAll() {
        for (Employee emp : eArr) {
            System.out.println(emp);
        }
    }

//    private static void saveToFile() {
//        try (
//        	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empdata.txt"))) {
//            oos.writeObject(eArr);
//        } catch (IOException e) {
//            System.out.println("Error saving data");
//        }
//    }
//
//    @SuppressWarnings("unchecked")
//    private static void loadFromFile() {
//        File file = new File("empdata.txt");
//        if (!file.exists()) {
//            eArr = new ArrayList<>();
//            return;
//        }
//
//        try (
//        	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("empdata.txt"))) {
//            eArr = (ArrayList<Employee>) ois.readObject();
//        } catch (Exception e) {
//            eArr = new ArrayList<>();
//        }
//    }
  
    private static void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("empdata.txt"))) {

            for (Employee e : eArr) {
                if (e instanceof HR) {
                    HR h = (HR) e;
                    bw.write("HR," + h.getId() + "," + h.getName() + "," +
                             h.getSalary() + "," + h.getCommission() + ",0");
                } 
                else if (e instanceof SalesManager) {
                    SalesManager sm = (SalesManager) e;
                    bw.write("SalesManager," + sm.getId() + "," + sm.getName() + "," +
                             sm.getSalary() + "," + sm.getTarget() + "," + sm.getIncentive());
                } 
                else if (e instanceof Admin) {
                    Admin a = (Admin) e;
                    bw.write("Admin," + a.getId() + "," + a.getName() + "," +
                             a.getSalary() + "," + a.getAllowance() + ",0");
                }
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }

    private static void loadFromFile() {
    	File file = new File("empdata.txt");
    	if(!file.exists())
    		return;
        try (BufferedReader br = new BufferedReader(new FileReader("empdata.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");
                String type = data[0];
                int id = Integer.parseInt(data[1]);
                String name = data[2];
                double salary = Double.parseDouble(data[3]);

                if (type.equals("HR")) {
                    double bonus = Double.parseDouble(data[4]);
                    eArr.add(new HR(id, name, salary, bonus));
                }
                else if (type.equals("SalesManager")) {
                    int target = Integer.parseInt(data[4]);
                    double incentive = Double.parseDouble(data[5]);
                    eArr.add(new SalesManager(id, name, salary, target, incentive));
                }
                else if (type.equals("Admin")) {
                    double allowance = Double.parseDouble(data[4]);
                    eArr.add(new Admin(id, name, salary, allowance));
                }
            }

        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }
}
