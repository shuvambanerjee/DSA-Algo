package recurssionAndBacktracking2;

public class RatInAMaze {
	
	public static boolean isPathPossible(int[][] a,int row,int column) {
		int n = a.length;
		// Base Conditions
		if(row >=n || column >=n || a[row][column]==0) return false;
		
		// Base Condition For Successfully reached
		if(row ==n-1 && column == n-1) {
			return true;
		}
		
		// check is path is possible from down
		if(isPathPossible(a, row+1, column)) return true;
		
		// check if path is possible from right
		if(isPathPossible(a, row, column+1)) return true;
		
		return false;
	}
	
	public static boolean isPathPossibleAndPrint(int[][] a,boolean[][]vis,int row,int column) {
		int n = a.length;
		// Base Conditions
		if(row >=n || column >=n || a[row][column]==0 || vis[row][column]) return false;
		
		// Base Condition For Successfully reached
		if(row ==n-1 && column == n-1) {
			vis[row][column] = true;
			return true;
		}
		
		vis[row][column] = true;
		// check is path is possible from down
		if(isPathPossibleAndPrint(a,vis, row+1, column)) return true;
		
		// check if path is possible from right
		if(isPathPossibleAndPrint(a,vis, row, column+1)) return true;
		
		vis[row][column] = false;
		
		return false;
	}
	

	public static void main(String[] args) {
		int a[][] = {
				{1, 1, 0, 1},
				{1, 1, 1, 1},
				{0, 0, 1, 0},
				{1, 1, 1, 1}
		};
		
		//System.out.println(isPathPossible(a, 0, 0));
		
		// if want to find the traveled path then add a boolean n * m matrix
		boolean[][] vis = new boolean[a.length][a.length];
		System.out.println(isPathPossibleAndPrint(a,vis, 0, 0));
		System.out.println("=====================================");
		for(boolean[] b : vis) {
			for(boolean e : b) {
				System.out.print(e+"  ");
			}
			System.out.println();
		}
	}

}
