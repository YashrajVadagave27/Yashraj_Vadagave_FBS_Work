public class Merge {
	public static void mergeSort(int[] arr, int start, int end) {
		if(start != end ) {
			int mid = (start+end)/2;
			
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			combine(arr, start, end, mid);
		}
	}

	public static void combine(int[] arr, int start, int end, int mid) {
		int i = start, j =mid+1, k=0;
		int[] narr = new int[end-start+1];
		while(i <= mid && j <= end) {
			if(arr[i] < arr[j]) {
				narr[k] = arr[i];
				i++;
				k++;
			}else {
				narr[k] = arr[j];
				k++;
				j++;
			}
		}
//this is for when your 1st while condition is false for any one side array
		while(i <= mid ) {
			narr[k] = arr[i];
			k++;
			i++;
		}
		while(j <= end ) {
			narr[k] = arr[j];
			k++;
			j++;
		}
		int y = start;
		for(int x=0; x<narr.length; x++) {
//			arr[start] = narr[x];
			arr[y] = narr[x];
			y++;
//			start++;
		}
	}

}
