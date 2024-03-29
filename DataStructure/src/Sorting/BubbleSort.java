package Sorting;

public class BubbleSort {
/**
 * This function will take and Integer array and will sort it.
 * @param arr
 */
	public static void sort(int arr[]) {
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			if (flag) {
				for (int j = 0; j < arr.length - 1; j++) {
					if (arr[j] > arr[j + 1]) {
						swap(arr, j, j + 1);
						flag = true;
					}
				}
			}else {
				flag = false;
				break;
			}
		}
	}

	private static void swap(int arr[], int i, int j) {
		if(i==j) {
			return;
		}
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
	
	public static void main(String args[]) {
		int arr[] = {20, 35, -15, 7, 55, 1, -22};
		sort(arr);
		for(int i=0 ; i< arr.length; i++) {
			System.out.print(arr[i] + "     ");
		}
	}
}
