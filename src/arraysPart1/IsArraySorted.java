package arraysPart1;

public class IsArraySorted {

	public static void main(String[] args) {
		int arr[] = {1,3,6,9,34,37,56};
		System.out.println(isSorted(arr));
	}

	static boolean isSorted(int[] arr) {
		boolean flag = true;
		for(int i = 1 ; i<arr.length ; i++) {
			if(arr[i] < arr[i-1]) {
				flag = false;
			}
		}
		return flag;
	}
}
