// # Without using the builtin method s.replace(), 
// # write its equivalent. Specifically, write the function 
// # replace(s1, s2, s3) that returns a string equal to 
// # s1.replace(s2, s3), but again without calling s.replace().


class replace {
	public String fun_replace(String s1, String s2, String s3){
		String res = "";
		for(int i =0 ;i < s1.length() ; i++){
			if(s1.charAt(i) == s2.charAt(0)){
				if(s1.substring(i, i+s2.length()).equals(s2)){
					res = res + s3;
					i = i + s2.length();
				}
				else{
					res = res + s1.charAt(i);
				}
			}
			else{
				res = res + s1.charAt(i);
			}
		}
		return s1;
	}
	
}
