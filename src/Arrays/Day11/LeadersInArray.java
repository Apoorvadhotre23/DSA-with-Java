package Arrays.Day11;

public class LeadersInArray {

	public static void main(String[] args) {
		int arr[] = {16, 17, 4, 3, 5, 2};
		int n = arr.length;
		
		leaders(arr, n);
		
	}
	
	public static void leaders(int arr[], int n) {
		for(int i = 0; i < n; i++) {
			boolean isLeader = true;
			for(int j = i+1; j < n; j++) {
				if(arr[i] <= arr[j]) {
					isLeader = false;
					break;
				}
			}
			if(isLeader) {
				System.out.println(arr[i]);
			}
		}
		
	
	}

}
