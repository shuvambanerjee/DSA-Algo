package math1;

public class TrailingZerosInFactorial {
	
	// Time Complexity O(logN)
	public static int findNoOfTrailingZeros(int num) {
		int count = 0;
		while(num > 0) {
			count = count + (num/5);
			num /= 5;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(findNoOfTrailingZeros(20));
	}

}
