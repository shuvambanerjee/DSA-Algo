package arraysPart1;

public class ThirdLargestElement {

	public static void main(String[] args) {
		int[] arr = {1,1,1,57,34,44,56};
		int third = thirdLargest(arr);
		System.out.println(arr[third]);
	}
	
	public static int thirdLargest(int[] arr) {
		int largest = 0;
		int second = 1;
		int third = -1;
		
		for(int i = 2 ; i< arr.length ;i++) {
			if(arr[i] > arr[largest]) {
				third = second;
				second = largest;
				largest = i;
			}
			else if ( arr[i] < arr[largest] ) {
				
				if(arr[i] > arr[second]) {
					third = second;
					second = i;
				}
				else if (arr[i] < arr[second]){
					
					if(third == -1 || arr[i] > arr[third]) {
						third = i;
					}
				}
			}
		}
		return third;
	}

}
