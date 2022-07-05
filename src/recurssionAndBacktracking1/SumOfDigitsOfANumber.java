package recurssionAndBacktracking1;

public class SumOfDigitsOfANumber {
	
	// To find no of digits : (log base 10 )10 + 1
	
	// Time Complexity : O(logN)
	// Space Complexity : O(logN)
	
	public static int sumOfDigits(int num) {
		if(num == 0) return 0;
		int lastDigit = num % 10;
		return lastDigit + sumOfDigits(num/10);
	}

	public static void main(String[] args) {
		System.out.println(sumOfDigits(12));

	}

}
