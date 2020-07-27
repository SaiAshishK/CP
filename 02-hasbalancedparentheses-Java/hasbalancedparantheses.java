import java.util.ArrayList;

// # Write the function hasBalancedParentheses, which takes a string and returns True 
// # if that code has balanced parentheses and False otherwise (ignoring all 
// # 	non-parentheses in the string). We say that parentheses are balanced if each 
// # right parenthesis closes (matches) an open (unmatched) left parenthesis, 
// # and no left parentheses are left unclosed (unmatched) at the end of the text. 
// # So, for example, "( ( ( ) ( ) ) ( ) )" is balanced, but "( ) )" is not balanced, and "( ) ) (" 
// # is also not balanced. Hint: keep track of how many right parentheses remain unmatched as 
// # you iterate over the string.

 
class hasbalancedparantheses {
	public boolean fun_hasbalancedparantheses(String s){
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("(");
		ar.add(")");
		String[] sp = s.split("");
		String res = "";
		for(String s1 : sp){
			if(ar.contains(s1)){
				res = res + s1;
			}
		}
		if(res.length()%2 != 0){
			return false;
		}
		String[] sp1 = res.split("");
		int c = 0;
		for(String s2 : sp1){
			if(s2.equals("(")){
				c++;
			}
			else if(s2.equals(")")){
				c--;
			}
			if(c < 0){

				return false;
			}
		}
		if(c == 0){return true;}
		return false;	
	}
}
	