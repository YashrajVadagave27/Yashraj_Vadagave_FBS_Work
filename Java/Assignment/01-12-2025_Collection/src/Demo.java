import java.util.ArrayList;
import java.util.TreeSet;

public class Demo{
	public static void main(String[] args) {
//		TreeSet t = new TreeSet();//it show classcaseexception
//		t.add(10);
//		t.add("firstbit");  
//		t.add(30);
//		
//		System.out.println(t);
		
//		TreeSet<Integer> ts = new TreeSet<Integer>();//it store only integaer value
//			ts.add(10);
//			ts.add("firstbit");  
//			ts.add(30);
//			
//		System.out.println(ts);
			
		ArrayList<Object> ts1 = new ArrayList<Object>();//it store both string and integer
			ts1.add(30);
			ts1.add("firstbit");
			ts1.add(20);
			
		System.out.println(ts1);
	}
}