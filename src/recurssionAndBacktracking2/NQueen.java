package recurssionAndBacktracking2;

public class NQueen {
	
	// Time Complexity : O(N!)
	
	private static boolean isSafe(int[][] a, int n, int row, int col) {
		// checking the entire column if queen is present
		for(int i = 0;i<n;i++) {
			if(a[i][col]==1) return false;
		}
		
		// checking for the left top right side diagonal
		for(int i = row, j = col ; i>=0 && j>=0; i--,j--) {
			if(a[i][j] == 1) return false;
		}
		
		// checking for the left top left side diagonal
		for(int i = row, j = col ; i>=0 && j < n; i--,j++) {
			if(a[i][j] == 1) return false;
		}
		
		return true;
	}
	
	public static boolean nQueen(int[][]a,int n,int row){
		if(row == n) return true;
		
		for(int col = 0; col<n ;col++) {
			if(isSafe(a,n,row,col)) {
				a[row][col] = 1;
				if(nQueen(a, n, row+1)) {
					return true;
				}
				// backtracking
				a[row][col] = 0;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][]a = new int[4][4];
		int n  = a.length;
		int row = 0;
		System.out.println(nQueen(a, n, row));
		
		for(int[] arr : a) {
			for(int e : arr) {
				System.out.print(e+"  ");
			}
			System.out.println();
		}
		
	}

}
