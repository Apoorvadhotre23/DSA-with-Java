package Mathematics.Day_01;

public class LCM_OptimisedCode {

	public static void main(String[] args) {
		int a = 25; 
		int b = 30;
		
		int res = gcd(a,b);
		int lcm = (a / res) * b;
		System.out.println(lcm);
		
	}

	public static int gcd(int a, int b) {
		while(a!= b) {
			if(a > b) {
			     a = a-b;
			} else {
				 b = b-a;
			}
		}
		return a;
	}
}
