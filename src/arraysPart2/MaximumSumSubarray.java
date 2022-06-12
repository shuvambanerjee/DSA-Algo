package arraysPart2;

public class MaximumSumSubarray {

	public static void main(String[] args) {
		int[] arr = {6,-7,4,-2,1,5,-4};
		System.out.println(maxSumSubArray(arr));

	}
	
	//Kadane's Algorithm

	public static int maxSumSubArray(int[] arr) {
		int currentSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++) {
			currentSum+=arr[i];
			if(maxSum < currentSum) maxSum = currentSum;
			if(currentSum < 0) currentSum = 0;
			
		}
		return maxSum;
	}
	
}
