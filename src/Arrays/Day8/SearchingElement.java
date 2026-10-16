package Arrays.Day8;

public class SearchingElement {

	public static void main(String[] args) {
	int arr[]  = {10, 20, 30, 40, 50};
	int res = Search(arr, 5, 50);
	System.out.println(res);
	}
	
	public static int Search(int arr[], int n, int x) {
		for(int i = 0; i < n; i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

}
