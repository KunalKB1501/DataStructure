package sorting;

import java.util.Arrays;
import static sorting.SelectionSort.*;
public class Tester {
	public static void main(String[] args) {
		int [] arr= {10,61,32,97,11,26,54,19};
		System.out.println(Arrays.toString(arr));
		System.out.println("After Insertion Sort");
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
