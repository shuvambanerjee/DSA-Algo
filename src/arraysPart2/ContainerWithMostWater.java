package arraysPart2;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] arr = {1,8,6,2,5,4,8,3,7};
		System.out.println(containerWithMostWater(arr));
	}

	static int containerWithMostWater(int[] arr) {
		int l = 0;
		int r = arr.length - 1;
		int maxArea = Integer.MIN_VALUE;
		while(l < r) {
			int distance = r - l;
			int height = Math.min(arr[l],arr[r]);
			int area = height * distance;
			maxArea = Math.max(maxArea, area);
			if(arr[l] < arr[r]) l++;
			else r--;	
		}
		return maxArea;
	}
}
