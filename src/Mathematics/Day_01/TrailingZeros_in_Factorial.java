package Mathematics.Day_01;

public class TrailingZeros_in_Factorial {

	public static void main(String[] args) {
		int n = 25;
		int result = 0;
		for(int i = 5; i<= n; i = i*5) {
			result = result + n / i;
		}
		System.out.println(result);
	}

}
