package Sorting;

public class ShellSort {
	
	public static void sort(int arr[]) {
		for(int shellLength = arr.length/2; shellLength > 0; shellLength--) {
			for(int i=shellLength; i<arr.length;i++) {
				int j = i;
				int newElement = arr[j];
				while(j>=shellLength && newElement < arr[j-shellLength] ) {
					arr[j] = arr[j-shellLength];
					j -= shellLength;
					printArray(arr);
				}
				arr[j] = newElement;
			}
		}
	}
	
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length;i++) {
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
