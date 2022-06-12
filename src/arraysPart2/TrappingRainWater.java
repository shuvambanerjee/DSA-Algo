package arraysPart2;

public class TrappingRainWater {

	public static void main(String[] args) {
		int[] arr = {1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(maxBlocksOfWater(arr));
	}
	
	public static int maxBlocksOfWater(int[] arr) {
		int sum = 0;
		int[] l = new int[arr.length];
		int[] r = new int[arr.length];
		
		l[0] = arr[0];
		for(int i = 1 ;i<l.length;i++) {
			l[i] = Math.max(arr[i],l[i-1]);
		}
		
		r[arr.length -1] = arr[arr.length -1];
		int curentMax = r[arr.length -1];		
		for(int i = r.length -2 ;i>=0;i--) {
			if(arr[i] >= curentMax) {
				curentMax = arr[i];
			}
			r[i] = curentMax;
		}
		
		
		for(int i = 0;i<arr.length;i++) {
			sum = sum + (Math.min(l[i], r[i]) - arr[i]);
		}	
		
		return sum;
		
	}

}
