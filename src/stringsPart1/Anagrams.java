package stringsPart1;

public class Anagrams {

	public static boolean isAnagram(String s1,String s2) {
		int[] arr = new int[256];
		for(int i = 0;i<s1.length();i++) {
			arr[s1.charAt(i)]++;
		}
		
		for(int i = 0;i<s2.length();i++) {
			arr[s2.charAt(i)]--;
		}
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] != 0) return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isAnagram("aweegh", "whage"));
	}

}
