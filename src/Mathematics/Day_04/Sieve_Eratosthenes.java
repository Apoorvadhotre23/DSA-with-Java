package Mathematics.Day_04;

import java.util.Arrays;

public class Sieve_Eratosthenes {

	public static void main(String[] args) {
		int n = 10;
		
		boolean isPrime[] = new boolean[n+1];
		Arrays.fill(isPrime, true);
		
		for(int i = 2; i * i <= n; i++) {
			if(isPrime[i]) {
				for(int j = 2*i; j <= n; j=j+i) {
					isPrime[j] = false;
				}
			}
		}
		
		for(int i = 2; i<=n; i++) {
			if(isPrime[i]) {
				System.out.println(i);
			}
		}
	}

}
