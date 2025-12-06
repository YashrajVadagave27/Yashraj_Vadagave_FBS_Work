package p1;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		TreeMap<MyKey, Employee> tm1 = new TreeMap<MyKey, Employee>();
		
		tm1.put(new MyKey(18), new Employee(18,"Virat",18000));
		tm1.put(new MyKey(45), new Employee(45,"Rohit",45000));
		tm1.put(new MyKey(12), new Employee(12,"Yuzi",400007));
		tm1.put(new MyKey(7), new Employee(7,"MS Dhoni",700007));
		
		if(tm1.containsKey(new MyKey(7))) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
		System.out.println(tm1);
	}
}
