package arraysPart2;

public class LeadersInArray {

	public static void main(String[] args) {
		int[] arr = {2,7,6,4,1,3};
		findLeader(arr);

	}
	
	public static void findLeader(int[] arr) {
		int currentMax = Integer.MIN_VALUE;
		for(int i = arr.length - 1 ; i>= 0 ; i--) {
			if(arr[i]> currentMax) {
				currentMax = arr[i];
				System.out.print(arr[i]+ " ");
			}
		}
	}

}
