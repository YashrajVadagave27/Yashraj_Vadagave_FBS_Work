import java.util.Scanner;

public class BubbleSortMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Before Sort Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

//        BubbleSort.sort(arr);
        SelectionSort.sort(arr);

        System.out.print("After Sort Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
