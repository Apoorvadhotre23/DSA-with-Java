package Mathematics.Day_03;

public class AllDivisorsOfNum {

	public static void main(String[] args) {
		int n =  30;
		printDivisors(n);
	}
	
	public static void printDivisors(int n) {
		int i;
		for(i = 1; i * i < n; i++) {
			if(n % i == 0) {
				System.out.print(i + " ");
			}
		}
		for(i = i-1; i >= 1; i--) {
			if(n % i == 0) {
				System.out.print(n/i + " ");
			}
		}
	}
}
