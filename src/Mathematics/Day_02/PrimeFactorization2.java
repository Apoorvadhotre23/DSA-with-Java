package Mathematics.Day_02;

import java.util.Scanner;

public class PrimeFactorization2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n == 1) {
			sc.close();
			return;
		}
		
		for(int i = 2; i * i <= n; i++) {
			while(n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			}
		}
		if (n > 1) {
			System.out.print(n);
		}
		
		sc.close();
	}

}
