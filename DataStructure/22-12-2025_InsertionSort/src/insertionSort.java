public class insertionSort {

	public static void sort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int x = arr[i];
			int j = i-1;
			while(j >= 0) {
				if(arr[j] > x) {
					arr[j+1] = arr[j];
					j--;
				}
				else {
//					arr[j+1] = x;  //this will not written in code only break bez it will override
					break;
				}
			}
			arr[j+1] = x;
		}
	}

}
