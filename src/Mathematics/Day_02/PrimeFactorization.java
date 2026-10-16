package Mathematics.Day_02;
import java.util.Scanner;

public class PrimeFactorization {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	    primefactor(num);
		sc.close();
	}

	public static void primefactor(int n) {
		for(int i = 2; i <= n; i++) {
			if(isPrime(i)) {
				while(n % i == 0) {
					System.out.println(i);
					n = n / i;
				}
			}
		}
	}
		public static boolean isPrime(int x) {
			if(x == 1) return false;
			if(x == 2 || x == 3) return true;
			if(x % 2 == 0 || x % 3 == 0) return false;
			
			for(int i = 5; i * i <= x; i= i+6) {
				if(x % i == 0 || x % (i+2) == 0) {
					return false;
				}
			}
			return true;
		}
}
