// # Without using the builtin method s.replace(), 
// # write its equivalent. Specifically, write the function 
// # replace(s1, s2, s3) that returns a string equal to 
// # s1.replace(s2, s3), but again without calling s.replace().


class replace {
	public static String fun_replace(String s1, String s2, String s3){
		String res = "";
		for(int i =0 ;i < s1.length() ; i++){
			if(s1.charAt(i) == s2.charAt(0)){
				// System.out.println("---------"+s1.substring(i, i+s2.length())+"------"+s2);
				if(i + s2.length() < s1.length()){
					if(s1.substring(i, i+s2.length()).equals(s2)){

						res = res + s3;
						i = i + s2.length()-1;
					}
					else{
						System.out.println("1. "+s1.charAt(i));
						res = res + s1.charAt(i);
					}
				}
				else{
					res = res + s1.charAt(i);
				}
			}
			else{
				System.out.println("2. "+s1.charAt(i));
				res = res + s1.charAt(i);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(fun_replace("helloworld123", "34567", "345"));
	}
	
}
