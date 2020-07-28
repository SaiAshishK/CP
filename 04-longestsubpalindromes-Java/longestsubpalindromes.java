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
		for(int i = 0 ; i < s.length() ; i++){
			for(int j = i+1 ; j <= s.length(); j++){
				if(isPal(s.substring(i, j))){
					ar.add(s.substring(i, j));
				}
			}
		}
		String res = "";
		int p =0;
		ArrayList<String> res1 = new ArrayList<String>();
		for(String s1 : ar){
			if(s1.length() > p){
				res = s1;
				p = s1.length();
			}
		}
		res1.add(res);
		for(String s2 : ar){
			if(s2.length() == p){
				res1.add(s2);
			}
		}
 		return Collections.max(res1);
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

}
