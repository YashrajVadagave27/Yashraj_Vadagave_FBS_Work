package ds_linear_search_17_12;

public class DoubletSum {

    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 5, 2, 10, -4};
        int target = 6;

        System.out.println("Doublets with sum " + target + ":");

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No doublets found");
        }
    }
}

