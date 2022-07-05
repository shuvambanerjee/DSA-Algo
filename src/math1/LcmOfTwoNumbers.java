package math1;

public class LcmOfTwoNumbers {
	
	private static int findHcf(int a, int b) {
		System.out.println(a+"  "+b);
		if(a < b) return findHcf(b, a);
		if(b == 0) return a;
		return findHcf(a%b, b);
	}
	
	public static int findLcm(int a,int b) {
		return (a * b)/findHcf(a,b);
	}

	public static void main(String[] args) {
		System.out.println(findLcm(12, 18));
	}

}
