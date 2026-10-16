package Arrays.Day11;

import java.util.Arrays;

public class LeftRotateBydElement {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50};
		int n = arr.length;
		int d = 2;
		
		System.out.println(Arrays.toString(arr));
		reverse(arr, 0, d-1);
		reverse(arr, d, n-1);
		reverse(arr, 0, n-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void reverse(int arr[], int low, int high) {
		while(low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}

}
