public class SelectionSort {
    public static void sort(int[] arr) {
    	for(int i=0; i<arr.length-1; i++) {
    		int min = arr[i];
    		int m_ind = i;
    		for(int j=i+1;j<arr.length; j++) {
    			if(min>arr[j]) {
    				min = arr[j];
    				m_ind = j;
    			}
    		}
    		arr[m_ind] = arr[i];
    		arr[i] = min; 
    	}
        
    }
}
