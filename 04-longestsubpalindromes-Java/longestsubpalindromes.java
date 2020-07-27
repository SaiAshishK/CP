import java.util.ArrayList;
import java.util.Collections;

// # Write the function longestSubpalindrome(s), that takes a string s and returns 
// the longest palindrome that occurs as consecutive characters (not just letters, but 
// 	any characters) in s. So:
// #    	longestSubpalindrome("ab-4-be!!!") 
// # returns "b-4-b". If there is a tie, return the lexicographically larger value -- 
// in java, a string s1 is lexicographically greater than a string s2 if (s1 > s2). So:
// #    	longestSubpalindrome("abcbce") 
// # returns "cbc", since ("cbc" > "bcb"). Note that unlike the previous functions, 
// this function is case-sensitive (so "A" is not treated the same as "a" here). Also, 
// from the explanation above, we see that longestSubpalindrome("aba") is "aba", 
// and longestSubpalindrome("a") is "a".

class longestsubpalindromes {
	public static String fun_longestsubpalindromes(String s){
		ArrayList<String> ar = new ArrayList<String>();
 		for(int i = 0; i < s.length()/2 -1 ; i++){
			String in = "" + s.charAt(i);
			System.out.println("in "+in);
			
		}
		return "";
	}
	public static String rev(String s){
		String r = "";
		for(int i = s.length()-1 ; i >=0 ; i--){
			r = r + s.charAt(i);
		}
		return r;
	}
	public static boolean isPal(String s){
		if(s.equals(rev(s))){
			return true;
		}
		return false;
	}
	public static int search(String s,String p){
		String[] r = rev(s).split("");
		for(int i = 0; i < r.length ; i++){
			if(r[i].equals(p)){
				return r.length - i -1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(fun_longestsubpalindromes("abcbce"));
	}
}
