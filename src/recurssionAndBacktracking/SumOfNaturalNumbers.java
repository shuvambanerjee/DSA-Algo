package recurssionAndBacktracking;

public class SumOfNaturalNumbers {
	
	public static int sum(int num) {
		if(num==0) return 0;
		return num + sum(num -1);
	}
	
	
	public static void main(String[] args) {
		System.out.println(sum(5));
	}
}
