package Sorting;

public class QuickSort {

	public static void main(String[] args) {
		int arr[] = {12,231,4324,243,23,12,13,21,41324,325,4365,356,45,63214,-31,1231,242,-13212,45};
		quickSort(arr, 0, arr.length);
		for(int i=0 ; i< arr.length; i++) {
			System.out.print(arr[i] + "     ");
		}
	}
	
   public static void quickSort(int arr[], int start, int end) {
	   if(end-start < 2) {
		   return;
	   }
	   
	   int index = partion(arr, start, end);
	   quickSort(arr, start, index);
	   quickSort(arr, index+1, end);
   }
   
   public static int partion(int arr[] , int start, int end) {
	   if(start == end) {
		   return start;
	   }
	   int pivot = arr[start];
	   int i = start;
	   int j = end;
	   
	   while(i<j && j>start && i<end) {
		   while(j>i && pivot<arr[--j]);
		     if(j>i) {
			   arr[i] = arr[j];
		     }
		   while(j>i && pivot > arr[++i] );
		   if(j>i) {
			   arr[j] = arr[i];
		   }
	   }
	   arr[i] = pivot;
	   return j;
   }
} 
