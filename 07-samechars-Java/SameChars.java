import java.util.ArrayList;
import java.util.*;
// sameChars(s1, s2) [20 pts]
// Write the function sameChars(s1, s2) that takes two strings and returns True if the two strings are composed of 
// the same characters (though perhaps in different numbers and in different orders) -- that is, if every character 
// that is in the first string, is in the second, and vice versa -- and False otherwise. This test is 
// case-sensitive, so "ABC" and "abc" do not contain the same characters. The function returns False if either 
// parameter is not a string, but returns True if both strings are empty (why?).

public class SameChars {
	public static boolean sameChars(String s1, String s2) {
		// Your code goes here
		if(s1.equals("") && s2.equals("")){
			return true;
		}
		if(s1.equals("") || s2.equals("")){
			return false;
		}
		String[] s12 = rem(s1).split("");
		String[] s22 = rem(s2).split("");
		Arrays.sort(s12);
		Arrays.sort(s22);
		if(s12.length != s22.length){
			return false;
		}
		for(int i =  0; i < s12.length ; i++){
			if(!s12[i].equals(s22[i])){
				return false;
			}
		}
		return true;
	}
	public static String rem(String s){
		String res = "";
		ArrayList<String> ar = new ArrayList<String>();
		String[] s1 = s.split("");
		for(String s2 : s1){
			if(!ar.contains(s2)){
				res = res + s2;
				ar.add(s2);
			}
		}
		return res;
	}
}