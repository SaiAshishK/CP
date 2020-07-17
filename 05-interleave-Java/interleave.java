// # Write the function interleave(s1, s2) that takes two strings, s1 and s2, 
// # and interleaves their characters starting with the first character in s1. 
// # For example, interleave('pto', 'yhn') would return the string "python". 
// # If one string is longer than the other, concatenate the rest of the remaining 
// # string onto the end of the new string. For example ('a#', 'cD!f2') would return 
// # the string "ac#D!f2". Assume that both s1 and s2 will always be strings.


class interleave {
	public String fun_interleave(String s1, String s2){
		int max = 0;
		int con = 0;
		String res = "";
		if(s1.length() == s2.length()){
			max = s1.length();
			con = 1;
		}
		else if(s1.length() > s2.length()){
			max = s2.length();
			con = 2;
		}
		else{
			max = s1.length();
			con = 3;
		}
		for(int i = 0; i < max ; i++){
			res = res + s1.charAt(i);
			res = res + s2.charAt(i);
		}
		if(con == 2){
			for(int i = max ; i < s1.length(); i++){
				res = res + s1.charAt(i);
			}
		}
		if(con == 3){
			for(int i = max ; i < s2.length(); i++){
				res = res + s2.charAt(i);
			}
		}
			return res;
	}
	
}