package arraysPart2;

public class MoveZeroesToRight {

	public static void main(String[] args) {
		int[] arr = {8,0,1,3,0,0,5};
		moveZerosToTheRight(arr);
		for(int e : arr) {
			System.out.print(e+" ");
		}

	}
	
	
	public static void moveZerosToTheRight(int[] arr) {
		int count = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		
		while(count < arr.length) {
			arr[count++] = 0;
		}
	}

}
