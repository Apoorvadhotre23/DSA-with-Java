package Mathematics.Day_01;

public class LCM {

	public static void main(String[] args) {
		int a = 25;
		int b = 35;
		int res = lcm(a,b);
		System.out.println(res);
	}
	
	public static int lcm(int a, int b) {
		int r = Math.max(a, b);
		
	 while(true) {
		if(r%a == 0 && r%b == 0) {
			return r;
		   }
		r++;
		}
	}

}
