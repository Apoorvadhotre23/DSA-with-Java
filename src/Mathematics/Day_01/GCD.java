package Mathematics.Day_01;

public class GCD {

	public static void main(String[] args) {
		int a = 100, b = 150;
	     int result = gcd(a, b);
	     System.out.println(result);
	    }
	    
	    public static int gcd(int a, int b) {
	        int res = Math.min(a,b);
	        
	        while(res > 0) {
	            if(a % res == 0 && b % res == 0) {
	                break;
	            }
	            res--;
	        }
	        return res;
	}

}
