// # Write the function nthTidyNumber that takes a non-negative int n and returns the nth Tidy Number. 
// # A tidy number is a number whose digits are in non-decreasing order.
// # fun_nth_tidynumber(0) = 1
// # fun_nth_tidynumber(1) = 2
// # fun_nth_tidynumber(5) = 6
// # fun_nth_tidynumber(15) = 17
// # fun_nth_tidynumber(35) = 46




class nth_tidynumber {
	public int fun_nth_tidynumber(int n){
		int p = 1;
		int count = 0;
		while(count != n){
			p++;
			if(istidy(p)){
				count++;
			}
		}
		return p;
	}
	public static boolean istidy(int n){
		if(n < 10){
			return true;
		}
		String[] s = Integer.toString(n).split("");
		for(int i = 0 ; i < s.length-1; i++){
			if(Integer.parseInt(s[i]) > Integer.parseInt(s[i+1])){
				return false;
			}
		}
		return true;
	}
}