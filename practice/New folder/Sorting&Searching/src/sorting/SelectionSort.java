package sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void selectionSort(int[] arr) {
		// first iterate the first element upto the last element(compare a[1] from a[2]
		// to a[n]
		// then if greater then shift right else remain as it is
		// then compare the the second upto last repeat this process until last element
		for (int i = 0; i <arr.length-1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// if greater then shift
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	
}
