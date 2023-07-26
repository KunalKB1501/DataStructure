package searching;

public class BinarySearch {
	public static int binarySearch(int[] arr, int key) {
		int mid = (0 + arr.length - 1) / 2;
		if (arr[mid] == key)
			return key;
		else if (key > arr[mid]) {
			for (int i = mid; i < arr.length; i++) {
				if (key == arr[i])
					return key;
			}
		} else
			for (int i = 0; i < mid; i++) {
				if (key == arr[i])
					return key;
			}
		return -1;
	}

	public static int binarySearchIndex(int[] arr, int key) {
		int left = 0;
		int right = arr.length - 1;
		int mid = (left + right) / 2;
		// return index at which element is found
		if (arr[mid] == key)
			return mid;
		if (key >= arr[mid]) {
			left = mid + 1;
			for (int i = left; i <= right; i++) {
				if (key == arr[i])
					return arr[i];
			}
		} else {
			right = mid - 1;
			for (int i = left; i <= right; i++) {
				if (key == arr[i])
					return arr[i];
			}
		}
		return -1;

	}
	//binary Search using while loop
	public static int binSearchWhile(int [] arr,int key) {
		int left = 0;
		int right = arr.length - 1;
		int mid ;
		while(left<=right) {
			mid=(left+right)/2;
			if(arr[mid]==key)
				return mid;
			if(key>=arr[mid])
				left=mid+1;
			else
				right=mid-1;	
		}
		return -1;
	}

}
