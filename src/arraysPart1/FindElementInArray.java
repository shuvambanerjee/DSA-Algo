package arraysPart1;

public class FindElementInArray {

	public static void main(String[] args) {
		int[] arr = {3,5,7,8,9,5,4};
		int key = 4;
		int index = findElement(arr, key);
		System.out.println("Element found at index "+index);

	}
	
	public static int findElement(int arr[],int key) {
		if(arr.length == 0) return -1;
		int index = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) {
				index = i;
			}
		}
		return index;
	}

}
