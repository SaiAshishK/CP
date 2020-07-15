// # Write the function setKthDigit(n, k, d) that takes three integers -- n, k, and d 
// # where n is a possibly-negative int, k is a non-negative int, and d is a non-negative 
// # single digit (between 0 and 9 inclusive). This function returns the number n with 
// # the kth digit replaced with d. Counting starts at 0 and goes right-to-left, 
// # so the 0th digit is the rightmost digit. 
import java.util.Arrays;

 
class set_kth_digit {
	public static int fun_set_kth_digit(int n, int k, int d){
		// your code goes here
		boolean flag = true;
		if(n<0){
			flag = false;
			n = -n;
		}
		String[] s1 = Integer.toString(n).split("");
		String[] s = new String[s1.length+1];
		s[0] = Integer.toString(0);
		int t = 1;
		for(String qq : s1){
			s[t++] = qq;
		}
		
		// System.out.println(Arrays.toString(s));
		// String[] p = new String[s.length];
		s[s.length - k - 1] = Integer.toString(d);
		// System.out.println(Arrays.toString(s));


		int res = 0;
		for(int j = 0 ; j < s.length ; j++){
			int r = Integer.parseInt(s[j]);
			// System.out.println(r);
			res = r + res*10;
			// System.out.println(res);
		}
		if(flag == false){
			res = -res;
		}

			return res;
	}
	
}