// # Write the function setKthDigit(n, k, d) that takes three integers -- n, k, and d 
// # where n is a possibly-negative int, k is a non-negative int, and d is a non-negative 
// # single digit (between 0 and 9 inclusive). This function returns the number n with 
// # the kth digit replaced with d. Counting starts at 0 and goes right-to-left, 
// # so the 0th digit is the rightmost digit. 

 
class set_kth_digit {
	public int fun_set_kth_digit(int n, int k, int d){
		// your code goes here
		int re = 0;
		while(n!=1){
			int t = n%10;
			re = re + t*10;
			n = n - t;
			n = n / 10;
		}
		String[] s = Integer.toString(re).split("");
		s[k] = Integer.toString(d);

		int res = 0;
		for(int j = 0 ; j < s.length ; j++){
			int r = Integer.parseInt(s[s.length - j -1]);
			res = res + r*10;
		}

			return res;
	}
}