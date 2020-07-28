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
	public static int fun_nth_smithnumber(int n) {
		if(n == 0){return 4;}
		int count = -1;
		int p = 1;
		while(count != n){
			p++;
			if(!isPrime(p)){
			if(isSmithNumber(p)){
				count++;
			}
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
	public static int sumofd(int s){
		String[] sp = Integer.toString(s).split("");
		int res = 0;
		for(String s1 : sp){
			res = res + Integer.parseInt(s1);
		}
		return res;
	}

	public static boolean isSmithNumber(int n){
		String str = "";
		// int sum = 0;
		int i = 2;
		int p = n;
		int temp = (n / 2 ) + 1;
		while(n != 0 && i < temp){
			if(n % i == 0){
				// System.out.println("n = " + n);
				str = str + i;
				// sum = sum + i;
				n = n / i;
			}
			else{
				i = i + 1;
				while(isPrime(i) == false){
					i = i + 1;
				}
			}
			
		}
		// System.out.println("str = " + str);
		str = str.trim();
		int new1 = Integer.parseInt(str);

		if(sumofd(p) == sumofd(new1)){
			return true;
		}
		else{
			return false;
		}

	}
	
}
