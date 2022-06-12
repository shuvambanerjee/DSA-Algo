package arraysPart1;

public class GreatestElementOnRightSide {
	public static void main(String[] args) {
		
//		int[] arr = {7,5,8,9,6,8,5,7,4,6};
		int[] arr = {7,8,12,9,6,8,5,1,4,6};
		greaterElementOnRightSide(arr);
		for(int e : arr) {
			System.out.print(e+" ");
		}
		
	}
	
	public static int[] greaterElementOnRightSide(int[] arr){
		int currentMax = arr[arr.length -1];
		arr[arr.length -1] = 0;
		for(int i = arr.length - 2 ; i>=0 ; i--) {
			int currentElement = arr[i];
			arr[i] = currentMax;
			if(currentElement > currentMax) {
				currentMax = currentElement;
			}
		}	
		return arr;
	}

}
