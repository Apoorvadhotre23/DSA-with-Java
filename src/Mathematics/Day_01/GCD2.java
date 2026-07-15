package Mathematics.Day_01;

public class GCD2 {
	public static void main(String[] args) {
			
		int a = 10;
		int b = 20;
		int res = gcd(a, b);
		System.out.println(res);
	}
	public static int gcd(int a, int b) {
		while( a!= b) {
			if(a > b) {
				a = a-b;
			} else {
				b = b-a;
			}
		}
		return a;
	}
}
