package Mathematics.Day_01;

public class Factorial_by_loops {

	public static void main(String[] args) {
		int n = 20;
		long fact = 1;
		
		for(int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
