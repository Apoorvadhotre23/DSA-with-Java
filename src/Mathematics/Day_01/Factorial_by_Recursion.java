package Mathematics.Day_01;

public class Factorial_by_Recursion {

	public static void main(String[] args) {
		int n = 4;
		System.out.println(fact(n));

	}

	public static int fact(int n) {
		
		if(n == 0) {
			return 1;
		}
		
		int result = n * fact(n-1);
		return result;
	}
}
