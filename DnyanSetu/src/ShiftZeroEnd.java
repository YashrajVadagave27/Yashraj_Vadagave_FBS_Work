public class ShiftZeroEnd {
    public static void main(String[] args) {
        int[] arr = {2,0,5,0,7,0};

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
