package math1;

public class NumberOfPathsInAMatrix {
	
	public static int findTotalNumberOfPathsPossible(int m, int n) {
		int min = 0;
		int max = 0;
		if(m < n) {
			min = m;
			max = n;
		}else {
			min = n;
			max = m;
		}
		int res = 1;
		for(int i = 1;i<max;i++) {
			res = (res*(min * i))/i;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(findTotalNumberOfPathsPossible(4,3));
	}

}
