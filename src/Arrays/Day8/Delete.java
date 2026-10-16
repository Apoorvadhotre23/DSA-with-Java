package Arrays.Day8;

public class Delete {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50};
		int length = arr.length;
		int target = 30;
		
		int res = deleteOp(arr, length, target);
		
		for(int i = 0; i < res; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int deleteOp(int arr[], int n, int x) {
		int i ;
		for(i = 0; i < n; i++) {
			if(arr[i] == x) {
				break;
			}
		}
		
		if( i == n) {
			return n;
		}
		
		for(int j = i; j < n-1; j++) {
			arr[j] = arr[j+1];
		}
		return n-1;
	}
}
