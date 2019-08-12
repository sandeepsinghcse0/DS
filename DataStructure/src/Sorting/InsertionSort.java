package Sorting;

public class InsertionSort {

	public static void sort(int arr[]) {
		for(int i=1; i<arr.length; i++) {
			int j = i;
			int newElement = arr[j];
			while(j>0 && newElement < arr[j-1]) {
				arr[j] = arr[j-1];
				j-=1;
			}
			arr[j] = newElement;
			//printArray(arr,i);
		}
	}
	
	public static void rSort(int arr[]) {
		if(arr.length<2)
			return;
		recSort(arr, arr.length);
	}
	
	public static void recSort(int arr[], int num) {
		if(num<2) {
			return;
		}
		recSort(arr, num-1);
		int newElement = arr[num-1];
		int index = num-1;
		for(int i = index; i>0 ;i--) {
			if(arr[i-1] < newElement) {
				arr[i] = arr[i-1];
				index = i-1;
			}
		}
		arr[index] = newElement;
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
		//sort(arr);
		rSort(arr);
		for(int i=0 ; i< arr.length; i++) {
			System.out.print(arr[i] + "     ");
		}
	}

}
