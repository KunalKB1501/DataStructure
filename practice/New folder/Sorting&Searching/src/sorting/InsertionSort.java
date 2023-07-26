package sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void insertion (int [] arr) {
		//if last elemnt is not sorted
		int j;
		int temp=arr[arr.length-1];
		for(j=arr.length-2;j>=0 && arr[j] > temp;j--) {
			arr[j+1]=arr[j];
			System.out.println(Arrays.toString(arr));
		}
		arr[j+1]=temp;
		System.out.println("---------------------------");
		System.out.println(Arrays.toString(arr));
		System.out.println("---------------------------");
	}
	public static void insertionSort(int [] arr) {
		for(int i=1;i<arr.length;i++) {
		int j;
		int temp=arr[i];
		for(j=i-1;j>=0 && arr[j] > temp;j--) {
			arr[j+1]=arr[j];
			//System.out.println(Arrays.toString(arr));
		}
		arr[j+1]=temp;
		}
	}
public static void main(String[] args) {
	//int [] arr= {1,2,4,5,9,3};
	int []arr2= {3,2,5,8,1,10};
	//insertion(arr);
	insertionSort(arr2);
	System.out.println(Arrays.toString(arr2));
}
}
