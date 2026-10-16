package Recursion.Day_06;

public class Palindrome_pr {

	public static void main(String[] args) {
		String s = "aba";
		int start = 0;
		int end = s.length()-1;
		
		System.out.println(isPalindrome(s, start, end));
	}
	
	public static boolean isPalindrome(String s, int start, int end) {
		if(start >= end) {
			return true;
		}
		return (s.charAt(start) == s.charAt(end)) && isPalindrome(s, start+1, end-1);
	}

}
