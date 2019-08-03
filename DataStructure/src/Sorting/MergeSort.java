package Sorting;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = {20, 35, -15, 7, 55, 1, -22};
		mergeSort(arr, 0, arr.length);
		for(int i=0 ; i< arr.length; i++) {
			System.out.print(arr[i] + "     ");
		}
	}
	
	
	public static void mergeSort(int arr[], int first, int last) {
		if(last - first < 2) {
			return;
		}		
		int mid = (first + last)/2;
		mergeSort(arr, first, mid);
		mergeSort(arr, mid, last);
		merge(arr, first, mid , last);
	}

	public static void merge(int arr[],int first,int mid,int last) {
		int temp[] = new int[last-first];
		int i = first;
		int j = mid;
		int index = 0;
		
		if(arr[mid-1] == arr[mid]) {
			return;
		}
		
		while(i<mid && j<last) {
			if(arr[i] < arr[j]) {
				temp[index] = arr[i];
				i++;
			}else {
				temp[index] = arr[j];
				j++;
			}
			index++;
		}
		
		if(i<mid) {
			while(i<mid) {
				temp[index] = arr[i];
				i++;
				index++;
			}
		}else {
			while(j<last) {
				temp[index] = arr[j];
				j++;
				index++;
			}
		}
		
		System.arraycopy(temp, 0, arr, first, index);
	}
}
