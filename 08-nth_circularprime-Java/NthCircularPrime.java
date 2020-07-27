import java.util.ArrayList;

// nthCircularPrime(n) [20 pts]
// Write the function nthCircularPrime that takes a non-negative int n and returns the nth 
// Circular prime, which is a prime number that does not contain any 0's and such that all the 
// numbers resulting from rotating its digits are also prime. The first Circular primes are 2, 3, 
// 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, 97, 113, 131, 197... To see why 197 is a Circular prime, 
// note that 197 is prime, as is 971 (rotated left), as is 719 (rotated left again).

public class NthCircularPrime {
	public long nthCircularPrime(int n) {
		// your code goes here
		int count = -1;
		int p  =0;
		boolean flag = true;
		while(count != n){
			p++;
			if(isPrime(p)){
				for(int as : combi(p)){
					if(!isPrime(as)){
						flag = false;
					}
				}
			}
			if(flag == true){
				count++;
			}
		}
		return p;
	}
	public static ArrayList<Integer> combi(int n){
		ArrayList<Integer> ar = new ArrayList<Integer>();
		String s = Integer.toString(n);
		for(int i = 0 ; i < n ; i++){
			String s1 = s.substring(i,s.length()) + s.substring(0,i);
			ar.add(Integer.parseInt(s1));
		}
		return ar;
	}
	public static boolean isPrime(int n) {
		if(n <=1){
			return false;
		}
		for(int i = 2; i < n;i++){
			if(n%i == 0){
				return false;
			}
			
		}
		return true;
	}
	public static boolean isn(int n){
		if(!isPrime(n)){
			return false;
		}
		for(int as : combi(n)){
			if(!isPrime(n)){
				return false;
			}
		}
		return true;
	}

}
