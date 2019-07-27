package Sorting;

public class InsertionSort {

	public static void sort(int arr[]) {
		for(int i=1; i<arr.length; i++) {
			int j = i;
			while(j>0 && arr[j]<arr[j-1]) {
				swap(arr, j , j-1);
				j-=1;
			}
			//printArray(arr,i);
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

	public static void printArray(int arr[], int len) {
		for(int i=0; i<=len && arr.length > len;i++) {
			System.out.print(arr[i] +"    ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = {20, 35, -15, 7, 55, 1, -22};
		sort(arr);
		for(int i=0 ; i< arr.length; i++) {
			System.out.print(arr[i] + "     ");
		}
	}

}
