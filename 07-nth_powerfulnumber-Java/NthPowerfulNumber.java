import java.util.ArrayList;

// nthPowerfulNumber(n) [20 pts]
// Write the function nthPowerfulNumber(n). See here for details. So nthPowerfulNumber(0) returns 
// 1, and nthPowerfulNumber(10) returns 64.
// A number n is said to be Powerful Number if for every prime factor p of it, p2 also divides it. 
// For example:- 36 is a powerful number. It is divisible by both 3 and square of 3 i.e, 9.

public class NthPowerfulNumber {
	public long nthPowerfulNumber(int n) {
		// Your code goes here
		int count = -1;
		int p =0;
		while(count != n){
			p++;
			if(ispow(p)){
				count++;
			}
		}
		return p;
	}
	public static ArrayList<Integer> factor(int n){
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for(int i = 2; i <= n ; i++){
			if(n%i==0){
				ar.add(i);
			}
		}
		return ar;
	}	
	public static boolean ispow(int n){
		if(isPrime(n)){return false;}
		ArrayList<Integer> e = factor(n);
		for(Integer q : e){
			if(isPrime(q)){
				if(!e.contains((int)Math.pow(q,2))){
					return false;
				}
			}
		}
		return true;

	}
	public static boolean isPrime(int n){
		if(n <= 1){
			return false;
		}
		for(int i = 2 ; i < n ; i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}