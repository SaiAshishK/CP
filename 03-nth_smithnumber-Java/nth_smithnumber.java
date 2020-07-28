// # Write the function nthSmithNumber that takes a non-negative int n 
// # and returns the nth Smith number, where a Smith number is a composite (non-prime) 
// # the sum of whose digits are the sum of the digits of its prime factors (excluding 1). 
// # Note that if a prime number divides the Smith number multiple times, its digit sum 
// # is counted that many times. For example, 4 equals 2**2, so the prime factor 2 is 
// # counted twice, thus making 4 a Smith Number.
// # so fun_nthsmithnumber(0) should return 4
// # so fun_nthsmithnumber(1) should return 22

import java.lang.Math; 
import java.util.Vector; 
public class nth_smithnumber {
	public int fun_nth_smithnumber(int n) {
		if(n == 0){return 2;}
		int count = 0;
		int p = 11;
		while(count != n){
			p++;
			if(isSm(p)){
				count++;
			}
		}
		return p;
	} 
	public static boolean isPrime(int n){
		if(n <= 1){
			return false;
		}
		for(int i = 2 ;i < n ; i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}
	public static int sumofd(String s){
		String[] sp = s.split("");
		int res = 0;
		for(String s1 : sp){
			res = res + Integer.parseInt(s1);
		}
		return res;
	}
	public static boolean isSm(int n){
		String s1 = Integer.toString(n);
		int sofd = sumofd(s1);
		if(sumfactor(n) == sofd){
			return true;
		}
		return false;
	}
	public static int sumfactor(int n){
		int s = 0;
		int i  = 2;
		while(n > 1 && !isPrime(n)){
			if(n%i == 0){
				System.out.println("----"+i);
				s = s + sumfactor(i);
				n = n/i;
			}
			i++;
			System.out.println(n);
		}
		return s+sumofd(Integer.toString(n));
	}
	public static void main(String[] args) {
		System.out.println(isSm(3));
	}
	
}
