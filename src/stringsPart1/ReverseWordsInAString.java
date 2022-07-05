package stringsPart1;

public class ReverseWordsInAString {
	
	static void reverseString(char[] c,int start,int end) {
		while(start < end) {
			char temp = c[start];
			c[start] = c[end];
			c[end] = temp;
			start++;
			end--;
		}
	}
	
	static String reverseWordsInAString(String str) {
		char[] c = str.toCharArray();
		int start = 0;
		int end = 0;
		
		// reverse every word in char array
		for(;end<c.length;end++) {
			if(c[end] == ' ') {
				reverseString(c, start, end-1);
				start = end + 1;
			}
		}
		reverseString(c, start, end-1);
		
		// Reverse the whole char array
		reverseString(c, 0, c.length -1);

		return new String(c);
		
	}

	public static void main(String[] args) {
		System.out.println(reverseWordsInAString("My Name Is Shuvam"));

	}

}
