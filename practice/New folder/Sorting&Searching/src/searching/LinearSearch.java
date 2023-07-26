package searching;

public class LinearSearch {
	//write a  static function so we can use it further
	public static int linearSearch(int[] arr,int key) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==key) {
				return arr[i];
			}
		}
		return -1;
	}
}
