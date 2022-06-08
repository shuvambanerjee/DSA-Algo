package arraysPart1;

public class DeleteElementFromArray {

	public static void main(String[] args) {
		int[] arr = {1,5,12,9,45,8};
		deleteElement(arr,9);
		for(int e : arr) {
			System.out.print(e+" ");
		}

	}
	
	public static void deleteElement(int[] arr,int element) {
		int n = arr.length;
		if(n == 0) return;
		int i = 0;
		for( ; i<n ; i++) {
			if(arr[i] == element) {
				break;
			}
		}
		if(i == n) return;
		if(i == n-1) {
			arr[i] = 0;
			return;
		}
		for(int j=i ;j<n-1 ;j++) {
			if(j == (n-2)) arr[j] = 0;
			arr[j] = arr[j+1];
		}		
	}

}
