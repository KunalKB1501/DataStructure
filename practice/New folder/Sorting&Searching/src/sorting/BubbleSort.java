package sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void improvedBubbleSort(int [] arr) {
		for(int j=arr.length-1;j>0;j--) {
			for(int i=0;i<arr.length-1;i++) {
					if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					}
					
				System.out.println(Arrays.toString(arr));
			}
			}
		
	}
	public static void moreImprovedBubbleSort(int [] arr) {
		for(int j=0;j<arr.length-1;j++) {
		for(int i=0;i<arr.length-1-i;i++) {
				if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				}
			System.out.println(Arrays.toString(arr));
		}
		}
	}
	//for already sorted array
	public static void sortedBubblesort(int [] arr) {
		boolean swapFlag=false;
		for(int j=0;j<arr.length-1;j++) {
			for(int i=0;i<arr.length-1-i;i++) {
					if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					swapFlag=true;
					}
				System.out.println(Arrays.toString(arr));
			}
			if(!swapFlag)
				break;
			}
	}
	public static void main(String[] args) {
		int []arr= {5,2,6,1,4};
	System.out.println(Arrays.toString(arr));
	//sort this array
//	for(int j=0;j<arr.length-1;j++) {
//	for(int i=0;i<arr.length-1;i++) {
//			if(arr[i]>arr[i+1]) {
//			int temp=arr[i];
//			arr[i]=arr[i+1];
//			arr[i+1]=temp;
//			}
//
//	//	System.out.println(Arrays.toString(arr));
//	}
//	}
	//improvedBubbleSort(arr);
	moreImprovedBubbleSort(arr);
	System.out.println("Sorted Array");
	System.out.println(Arrays.toString(arr));
	int [] arr2= {1,2,3,4,5};
	sortedBubblesort(arr2);
	System.out.println(Arrays.toString(arr2));
	}
}
 