/**
 * 
 */
package Sorting;

/**
 * @author sansingh25
 *
 */
public class SelectionSort {
	/**
	 * Selection sort will be applied to the array
	 * @param arr
	 */ 
	public static void sort(int arr[]) {
		for(int lastUnsortedndex = arr.length -1; lastUnsortedndex >=0; lastUnsortedndex--) {
			int largest = arr[0];
			int index = 0;
			for(int i=1;i<=lastUnsortedndex; i++) {
				if(largest < arr[i]) {
					largest = arr[i];
					index = i;
				}
			}
			swap(arr, index, lastUnsortedndex);
			printArray(arr);
		}
	}
	
	private static void swap(int arr[], int i, int j) {
		if(i==j) {
			return;
		}
		int temp;
	    temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}

	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] +"    ");
		}
		System.out.println();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {20, 35, -15, 7, 55, 1, -22};
		sort(arr);
		for(int i=0 ; i< arr.length; i++) {
			System.out.print(arr[i] + "     ");
		}
	}

}
