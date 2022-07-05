package recurssionAndBacktracking;

public class NumberOfPathsInAMatrix {
	
	// Time Complexity O(2^ (m*n))
	
	public static int findNumberOfPaths(int row,int column) {
		if(row==1 || column ==1 ) return 1;
		int rightSide = findNumberOfPaths(row, column-1);
		int downSide = findNumberOfPaths(row-1, column);
		return rightSide + downSide;
		
	}

	public static void main(String[] args) {
		System.out.println(findNumberOfPaths(3, 4));

	}

}
