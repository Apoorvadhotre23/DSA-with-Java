package Mathematics.Day_01;

public class TrailingZeros {

	public static void main(String[] args) {
		System.out.println(trailing(120));
	}
	
	public static int trailing(int n) {
		int count = 0;
		
		while(n > 0) {
			if( n % 10 == 0) {
				count++;
			} else {
				break;
			}
			n = n / 10;
		}
		return count;
	}

}
