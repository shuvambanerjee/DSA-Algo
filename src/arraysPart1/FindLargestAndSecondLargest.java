package arraysPart1;

public class FindLargestAndSecondLargest {

	public static void main(String[] args) {
		int[] arr = {3,6,9,2,5,19};
		int secondLargest = findLargeAndSecondLarge(arr);
		System.out.println(arr[secondLargest]);
	}

	static int findLargeAndSecondLarge(int[] arr) {
		if(arr.length < 2) {
			System.out.println("There is no second largest element");
			return -1;
		}
		
		int large = 0;
		int secondLarge = -1;
		
		for(int i = 1 ; i < arr.length ; i++) {
			if(arr[i] > arr[large]) {
				secondLarge = large;
				large = i;
			}else if (arr[i] < arr[large]) {
				if(secondLarge == -1 || arr[i] > arr[secondLarge]) {
					secondLarge = i;
				}
			}
		}
		return secondLarge;
	}
}
