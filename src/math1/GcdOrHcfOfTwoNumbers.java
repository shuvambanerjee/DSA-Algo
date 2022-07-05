package math1;

public class GcdOrHcfOfTwoNumbers {
	
	// time Complexity O(logN)
	public static int findGcd(int a, int b) {
		System.out.println(a+"  "+b);
		if(b > a) return findGcd(b, a);
		if(a == b) return a;
		return findGcd(a-b, b);
		
	}
	
	// time Complexity O(logN) --> optimized
	public static int gcdModified(int a,int b) {
		System.out.println(a+"  "+b);
		if(a < b) return gcdModified(b, a);
		if(b==0) return a;
		return gcdModified(a%b,b);
		
	}

	public static void main(String[] args) {
		System.out.println(findGcd(60, 24));
		System.out.println(gcdModified(60, 24));
	}

}
