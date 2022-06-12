package arraysPart1;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,5};
		int[] res = reverseArray(arr);
		for(int e : res) {
			System.out.print(e+" ");
		}

	}
	// Time Complexity - Theta(n)
	// Space Complexity = BigO (n)
//	public static int[] reverseArray(int[] arr) {
//		int[] reverseArray = new int[arr.length];
//		int index = arr.length -1;
//		for(int i = 0 ;i < reverseArray.length ;i++ ) {
//			reverseArray[i] = arr[index--];
//		}
//		return reverseArray;
//	}
	
	
	// Time Complexity - Theta(n)
	// Space Complexity = BigO (1)
	public static int[] reverseArray(int[] arr) {
	int temp;
	int n = arr.length;
	for(int i = 0 ;i < n/2 ;i++ ) {
		temp = arr[i];
		arr[i] = arr[n -i -1];
		arr[n -i -1] = temp;
	}
	return arr;
}
	
	

}
