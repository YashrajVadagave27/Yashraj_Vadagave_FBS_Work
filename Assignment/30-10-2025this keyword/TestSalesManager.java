class SalesManager
{
    int id;
    String name;
    double salary, incentive;
    int target;

    void setId(int i){
        this.id = i;
    }

    void setName(String n){
        this.name = n;
    }

    void setSalary(double s){
        this.salary = s;
    }

    void setIncentive(double inc){
        this.incentive = inc;
    }

    void setTarget(int t){
        this.target = t;
    }
} // SalesManager ends here

class TestSalesManager
{
    public static void main(String[] args)
    {
        SalesManager sm1;
        sm1 = new SalesManager();
        sm1.setId(101);
        sm1.setName("Rahul Sharma");
        sm1.setSalary(50000);
        sm1.setIncentive(7000);
        sm1.setTarget(20);

        System.out.println("Sales Manager Details:");
        System.out.println("ID        : " + sm1.id);
        System.out.println("Name      : " + sm1.name);
        System.out.println("Salary    : " + sm1.salary);
        System.out.println("Incentive : " + sm1.incentive);
        System.out.println("Target    : " + sm1.target);
    } // main ends here
} // TestSalesManager ends here
