package Mathematics.Day_05;

public class RightMostDifferentBit {

	public static void main(String[] args) {
		int res = rightBit(11, 9);
		System.out.println(res);
	}
	
	public static int rightBit(int m, int n) {
		int x = m ^ n;
		int pos= 1;
		while( x > 0) {
			
			if(x ==  0) {
				return -1;
			}
			if ((x & 1) == 1) {
			    return pos;
			}
			x = x >> 1;
			pos++;
		}
		return -1;
	}
}
