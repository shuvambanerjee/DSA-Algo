package arraysPart1;

public class FindLargestInArray {

	public static void main(String[] args) {
		int[] arr = {2,5,90,5,111,34};
		int index = findLargest(arr);
		System.out.println(arr[index]);

	}
	
	public static int findLargest(int[] arr) {
		if(arr.length == 0) return -1;
		int largest = 0;
		for(int i = 1;i<arr.length;i++) {
			if(arr[i] > arr[largest]) {
				largest = i;
			}
		}
		return largest;
	}

}
