package recurssionAndBacktracking;

public class FindPowerOfANumber {
	
	// to find a^b
	public static int findPower(int a,int b) {
		if(b==0) return 1;
		return a * findPower(a, b-1);
	}

	public static void main(String[] args) {
		System.out.println(findPower(2, 4));
	}

}
