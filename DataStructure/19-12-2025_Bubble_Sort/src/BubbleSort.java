public class BubbleSort {

    public static void sort(int[] arr) {
        int n = arr.length;
        int totalSwaps = 0;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    totalSwaps++;
                    swapped = true;
                }
            }

            if (!swapped) {
                System.out.println("Array is sorted at iteration: " + (i + 1));
                System.out.println("Total number of swaps: " + totalSwaps);
                return;
            }
        }

        System.out.println("Array is sorted after all iterations");
        System.out.println("Total number of swaps: " + totalSwaps);
    }
}
