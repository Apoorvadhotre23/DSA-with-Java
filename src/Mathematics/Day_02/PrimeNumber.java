package Mathematics.Day_02;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 1;
		boolean isPrime = true;
		
		if(n < 2) {
			isPrime = false;
		}
		
		for(int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not a Prime Number");
		}
	}

}
