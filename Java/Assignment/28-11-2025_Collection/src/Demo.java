import java.util.*;

class Demo{
	public static void main(String[] args) {
//		ArrayList<Integer> a1 = new ArrayList<Integer>();
//		
//		a1.add(10);
//		a1.add(30);
//		a1.add(20);
//		
//		System.out.println("ArrayList Is : "+a1);
		
		TreeSet<Integer> a1 = new TreeSet<Integer>();
		
		a1.add(10);
		a1.add(30);
		a1.add(20);
		
		System.out.println("TreeSet Is : "+a1);
		
		if(a1.contains(30)) // contains is used to search in collection
		{ 
			System.out.println("Found!!");
		}
		else {
			System.out.println("Not Found!!");
		}
		
//		a1.remove(20); // for treeset give value
		a1.remove(1); //for arraylist give index
		
		System.out.println("Removed From TreeSet Is : "+a1);
	}
}