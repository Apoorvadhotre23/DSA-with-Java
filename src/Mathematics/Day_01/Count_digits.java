package Mathematics.Day_01;

import java.util.Scanner;

public class Count_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = count(n);
		System.out.println(result);
		sc.close();
	}
	public static int count(int n) {
		int temp = n;
		int count = 0;
		while(temp > 0) {
			count++;
			temp /= 10;
		}
		return count;
		
	}
	
}
