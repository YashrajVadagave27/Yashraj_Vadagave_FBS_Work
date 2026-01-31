import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        BubbleSortString.sort(arr);

        System.out.println("\nSorted strings:");
        for (String s : arr) {
            System.out.println(s);
        }
        sc.close();
    }
    
}
