package stringsPart1;

public class LengthOfLastWord {
	
	static int getLengthOfLastWordOfAString(String s){
		int end = s.length() -1;
		int count  = 0;
		for(int i = end ; i>=0 ;i--) {
			if(s.charAt(i) == ' ') {
				break;
			}else {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(getLengthOfLastWordOfAString("God Is Great"));

	}

}
