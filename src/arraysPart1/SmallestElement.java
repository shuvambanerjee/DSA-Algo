package arraysPart1;

public class SmallestElement {

	public static void main(String[] args) {
		int arr[] = {2,5,9,4,7};
		int min = smallest(arr);
		System.out.println(arr[min]);
	}
	
	public static int smallest(int[] arr) {
		int min = 0;
		for(int i = 1 ;i<arr.length;i++) {
			if(arr[min] > arr[i]) {
				min = i;
			}
		}
		return min;
	}

}
