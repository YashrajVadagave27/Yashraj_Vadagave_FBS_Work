package p1;
import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] args) {

        HashMap<MyKey, Employee> hm1 = new HashMap<MyKey, Employee>();

        hm1.put(new MyKey(18), new Employee(18,"Virat",18000));
        hm1.put(new MyKey(45), new Employee(45,"Rohit",45000));
        hm1.put(new MyKey(12), new Employee(12,"Yuzi",400007));
        hm1.put(new MyKey(7), new Employee(7,"MS Dhoni",700007));

        if(hm1.containsKey(new MyKey(7))) {
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }

        System.out.println(hm1);
    }
}
