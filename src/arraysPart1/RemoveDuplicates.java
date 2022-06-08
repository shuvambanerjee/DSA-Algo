package arraysPart1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = {2,4,4,5,5,6,7,7};
		removeDuplicatesFromArray(arr);
		for(int e : arr) {
			System.out.print(e+" ");
		}
	}
	
	public static void removeDuplicatesFromArray(int[] arr) {
		if(arr.length == 0) return;
		int j = 0;
		for(int i = 1 ; i< arr.length ;i++) {
			if(arr[i] != arr[j]) {
				arr[j+1] = arr[i];
				j++;
			} 
		}
	}

}
