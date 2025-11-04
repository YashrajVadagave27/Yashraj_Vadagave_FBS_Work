class Admin {
   	   int id;
 	   String name;
   	   double salary;
  	   double allowance;

    void setId(int i) {
        this.id = i;
    }
    void setName(String n) {
        this.name = n;
    }
    void setSalary(double s) {
        this.salary = s;
    }
    void setAllowance(double a) {
        this.allowance = a;
    }
}//admin Ends here

class TestAdmin {
    public static void main(String[] args) {
        Admin a1;
        a1 = new Admin();

        a1.setId(101);
        a1.setName("Rohit");
        a1.setSalary(35000.0);
        a1.setAllowance(5000.0);

        System.out.println("Admin ID: " + a1.id);
        System.out.println("Admin Name: " + a1.name);
        System.out.println("Admin Salary: " + a1.salary);
        System.out.println("Admin Allowance: " + a1.allowance);
    }//main ends here 
}//TestAdmin end here 