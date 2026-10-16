package Mathematics.Day_01;

public class GCD3 {

	public static void main(String[] args) {
		int a = 25;
		int b = 50;
		int hcf = 1;
		int limit = Math.min(a, b);
		
		for(int i = limit; i > 0; i--) {
			if(a % i == 0 && b % i == 0) {
				hcf = i;
				break;
			}
		}
		System.out.println("HCF is " + hcf);
	}

}
