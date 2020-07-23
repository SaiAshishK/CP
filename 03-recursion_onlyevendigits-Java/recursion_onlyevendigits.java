// # Without using iteration and without using strings, 
// # write the recursive function onlyEvenDigits(L), 
// # that takes a array L of non-negative integers 
// # (you may assume that), and returns a new array of 
// # the same numbers only without their odd digits 
// # (if that leaves no digits, then replace the number with 0). 
// # So: onlyEvenDigits([43, 23265, 17, 58344]) returns [4, 226, 0, 844]. 
// # Also the function returns the empty array if the original array is empty. 
// # Remember to not use strings. You may not use loops/iteration in this problem.
import java.lang.Math;
import java.util.*;
class recursion_onlyevendigits {
	static int r = 0;
	static int qw = 0;
	public static int number(int n){
		int res = 0;
		while(n!=0){
			int p = n%10;
			n = n - p;
			n = n /10;
			System.out.println(p+ "  "+n);
			if(p%2 == 0){
				res = res*10 + p;
			}
		}
		int reversed = 0;
		while(res != 0) {
            int digit = res % 10;
            reversed = reversed * 10 + digit;
            res /= 10;
        }
		System.out.println(reversed);
		return reversed;
	} 
	public static int[] fun_recursion_onlyevendigits(int[] l){
		if(l.length == 0){
			return new int[]{};
		}
		if(r == l.length){
			r = 0;
			return l;
		}
		int as = number(l[r]);
		l[r] = as;
		System.out.println(Arrays.toString(l));
		r++;
		fun_recursion_onlyevendigits(l);
		return l;
	}
	public static void main(String[] args) {
		System.out.println(fun_recursion_onlyevendigits(new int[]{332, 81, 11}));
	}
}


