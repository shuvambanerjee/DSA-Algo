package math1;

public class PalindromeNumber {
	
	public static boolean isPalindrome(int n) {
		int rev = 0;
		int temp = n;
		while(temp > 0) {
			int lastDigit = temp % 10;
			rev = rev * 10 + lastDigit;
			temp /= 10;
		}
		return rev == n;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(1231));

	}

}
