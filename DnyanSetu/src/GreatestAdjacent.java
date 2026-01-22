public class GreatestAdjacent {
    public static void main(String[] args) {
        int[] arr = {1,5,3,4,1,9,8};

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
