import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size if array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter elements in array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Array before sort: ");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		insertionSort.sort(arr);
		
		System.out.print("Array after sort: ");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}
