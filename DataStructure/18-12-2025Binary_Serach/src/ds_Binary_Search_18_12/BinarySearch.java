package ds_Binary_Search_18_12;

import java.util.Scanner;
import java.util.Arrays;

class BinarySearch {

    static int binarySearch(int[] arr, int size, int key) {
        int low = 0;
        int high = size - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid; 
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.print("Sorted array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int result = binarySearch(arr, n, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}

