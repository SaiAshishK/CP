// # Write the function wordWrap(text, width) that takes a string of text (containing only lowercase letters
// #  or spaces) and a positive integer width, and returns a possibly-multiline string that matches the 
// # original string, only with line wrapping at the given width. So wordWrap("abc", 3) just returns "abc", 
// # but wordWrap("abc",2) returns a 2-line string, with "ab" on the first line and "c" on the second line. 
// # After you complete word wrapping in this way, only then: All spaces at the start and end of each 
// # resulting line should be removed, and then all remaining spaces should be converted to dashes ("-"), 
// # so they can be easily seen in the resulting string. Here are some test cases for you:
// # assert(wordWrap("  abcdefghij", 4)  ==  """\
// # abcd
// # efgh
// # ij""")

// # assert(wordWrap(" a b c de fgh ",  4)  ==  """\
// # a-b-
// # c-de
// # -fgh""")

class wordwrap {
	public static String fun_wordwrap(String s, int n){
		while(s.charAt(0) == (' ')){
			s = s.substring(1);
		}
		while(s.charAt(s.length()-1) == ' '){
			s= s.substring(0, s.length()-1);
		}
		int p = s.length()/n;
		String res = "";
		// for(int j = 0 ; j < s.length() ; j = j+n){
		int y = 0;
		int p1 = 0;
		while(y!=p){
			res = res + s.substring(p1,p1+n);
			res = res + "\n";
			p1 = p1 + n;
			y++;
		}
		if(s.substring(p1).equals("")){
			res = res.substring(0, res.length()-1);
		}
		res = res+s.substring(p1);
		String[] res1 = res.split("");
		String res2 = "";
		for(String p2 : res1){
			if(p2.equals(" ")){
				res2 = res2 + "-";
			}
			else{
				res2 = res2 + p2;
			}
		}
		return res2;
	}
}