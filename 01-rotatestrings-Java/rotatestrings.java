// # Write the function rotatestring(s, k) that takes a string s and a possibly-negative integer k. 
// # If k is non-negative, the function returns the string s rotated k places to the left. 
// # If k is negative, the function returns the string s rotated |k| places to the right. So, for example:
// # assert(rotateString('abcd',  1) == 'bcda')
// # assert(rotateString('abcd', -1) == 'dabc')

class rotatestrings {
	public String fun_rotatestrings(String s, int n){
		if(n > 0 ){
			String res = "";
			String s1 = s.substring(0, n);
			String[] sp = s.split("");
			for(int i = n ; i < sp.length ;i++){
				res = res + sp[i];
			}
			res = res + s1;
			return res;
		}
		else{
			return s;
		}
		
	}
}