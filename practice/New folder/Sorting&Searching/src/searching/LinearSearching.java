package searching;

import static searching.BinarySearch.binSearchWhile;

import java.util.Arrays;
import java.util.Scanner;
public class LinearSearching {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int [] arr= {3,4,5,1,44,22,65,11};
		 System.out.println(Arrays.toString(arr));
		 System.out.println("Find the element ");
		 int element=sc.nextInt();
		 //find element 
//		 for(int i=0;i<arr.length;i++)
//		 {
//			 if(arr[i]==element) {
//				 System.out.println("found "+arr[i]);
//				 System.out.println("Index of element is "+i);
//				 break;
//			 }
//		 }
//		 int value=linearSearch(arr, element);
//		 if(value!=-1)
//			 System.out.println("Element found "+value);
//		 else
//			 System.out.println("Not Found");
		 //binary search
		 //first make that array sorted
		 Arrays.sort(arr);
		int value=binSearchWhile(arr, element);
		 if(value!=-1)
			 System.out.println("Element found "+value);
		 else
			 System.out.println("Not Found");
		 sc.close();
		// System.out.println(arr.length);
	}

}
