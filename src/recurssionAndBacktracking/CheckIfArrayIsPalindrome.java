package recurssionAndBacktracking;

public class CheckIfArrayIsPalindrome {
	
	public static boolean isPalindrome(int[] arr,int start, int end) {
		if(arr.length == 0 || start>=end) return true;
		if(arr[start]==arr[end]) {
			return isPalindrome(arr, start+1, end-1);
		}
		return false;
		
	}

	public static void main(String[] args) {
		int[] arr = { 3, 6, 0, 7, 3};
		System.out.println(isPalindrome(arr, 0, arr.length-1));
	}

}
