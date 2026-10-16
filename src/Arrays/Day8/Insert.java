package Arrays.Day8;

public class Insert {

	public static void main(String[] args) {
		int arr[]  = new int[5];
		System.out.println(arr.length);
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		int size = 4;
		
		int res = InsertOp(arr, size, 50, 5);

	    for (int i = 0; i < res; i++) {
	        System.out.print(arr[i] + " ");
	    }
	}
	
	public static int InsertOp(int arr[], int n, int x, int pos) {
		if( n == arr.length) {
			return n;
		}
		int idx = pos-1;
		for(int i = n-1; i >= idx; i--)  {
			arr[i+1] = arr[i];
		}
		arr[idx] = x;
		return n+1;
	}

}
