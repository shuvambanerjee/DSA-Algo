package arraysPart2;

public class FrequencyOfElementsInSortedArray {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 2, 3, 3, 5, 5,8, 8, 8, 9, 9, 10 };
		findFrequency(arr);
	}
	
	public static void findFrequency(int[] arr) {
		int frequency = 1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i] == arr[i-1]) {
				frequency++;
			}else {
				System.out.println("Frequency of "+arr[i-1]+" is : "+frequency);
				frequency = 1;
			}
		}
		System.out.println("Frequency of "+arr[arr.length-1]+" is : "+frequency);
	}

}
