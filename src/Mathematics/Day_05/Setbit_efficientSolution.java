package Mathematics.Day_05;

public class Setbit_efficientSolution {

	public static void main(String[] args) {
		setbit(5, 4);
	}
	
	public static void setbit(int n, int k) {
		int x = (n << k-1);
		
		if((n & x) != 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
