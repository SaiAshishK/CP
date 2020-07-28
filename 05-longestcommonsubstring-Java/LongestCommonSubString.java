import java.util.ArrayList;
import java.util.Collections;

// longestCommonSubstring(s1, s2)[20 pts]
// Write the function, longestCommonSubstring(s1, s2), that takes two possibly-empty strings and returns the longest 
// string that occurs in both strings (and returns the empty string if either string is empty). For example:
// longestCommonSubstring("abcdef", "abqrcdest") returns "cde"
// longestCommonSubstring("abcdef", "ghi") returns "" (the empty string)
// If there are two or more longest common substrings, return the lexicographically smaller one (ie, just use "<" to 
// compare the strings). So, for example:
// longestCommonSubstring("abcABC", "zzabZZAB") returns "AB" and not "ab"

public class LongestCommonSubString {
	public String longestCommonSubstring(String s1, String s2) {
		// Your code goes here
		ArrayList<String> s11 = new ArrayList<String>();
		for(int i = 0 ; i < s1.length() ; i++){
			for(int j = i+1 ; j <= s1.length() ; j++){
				s11.add(s1.substring(i,j));
			}
		}
		ArrayList<String> s22 = new ArrayList<String>();
		for(int i = 0 ; i < s2.length() ; i++){
			for(int j = i+1 ; j <= s2.length() ; j++){
				s22.add(s2.substring(i,j));
			}
		}
		ArrayList<String> com = new ArrayList<String>();
		for(String sp : s11){
			if(s22.contains(sp)){
				com.add(sp);
			}
		}
		ArrayList<String> com1 = new ArrayList<String>();
		int p = 0;
		String res = "";
		for(String sa : com){
			if(sa.length() > p){
				p  = sa.length();
				res = sa;
			}
		}
		com1.add(res);
		for(String sd : com){
			if(sd.length() == p && !sd.equals(res)){
				com1.add(sd);
			}
		}
		if(com1.size() == 1){return com1.get(0);}
		String res12 = com1.get(0);
		for(String l : com1){
			if(res12.compareTo(l) > 0 ){
				res12 = l;
			}
		}
		return res12;
	}
	
}