package stringsPart1;

public class StringSubSequence {
	
	static boolean isSubSequence(String str1, String str2) {
		int i = 0;
		int j = 0;
		while(i < str1.length() && j < str2.length()) {
			if(str1.charAt(i) == str2.charAt(j)) i++;
			if( i == str1.length()) return true;
			j++;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isSubSequence("abc", "baacd"));
	}

}
