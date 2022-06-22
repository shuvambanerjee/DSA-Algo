package recurssionAndBacktracking;

public class SumOfSquareOfNaturalNumbers {

	
	public static int sumOfSquareOfNaturalNumbers(int num) {
		if(num == 0) return 0;
		return (num*num)+sumOfSquareOfNaturalNumbers(num-1);
	}
	
	
	public static void main(String[] args) {
		System.out.println(sumOfSquareOfNaturalNumbers(4));
	}

}
