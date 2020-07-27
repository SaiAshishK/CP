import java.util.ArrayList;

// nthCircularPrime(n) [20 pts]
// Write the function nthCircularPrime that takes a non-negative int n and returns the nth 
// Circular prime, which is a prime number that does not contain any 0's and such that all the 
// numbers resulting from rotating its digits are also prime. The first Circular primes are 2, 3, 
// 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, 97, 113, 131, 197... To see why 197 is a Circular prime, 
// note that 197 is prime, as is 971 (rotated left), as is 719 (rotated left again).

public class NthCircularPrime {
	public static long nthCircularPrime(int n) {
		// your code goes here
		int count = 0;
		long p  =0;
		while(count != n){
			// System.out.println("count "+count+" n  "+n);
			p++;
			// System.out.println("   p   "+p);
			if(isn((int)p)){
				count++;
			}
		}
		System.out.println(p);
		return p;
	}
	public static ArrayList<Integer> combi(int n){
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(n);
		String s = Integer.toString(n);
		for(int i = 0 ; i < s.length() ; i++){
			String s1 = s.substring(i,s.length()) + s.substring(0,i);
			System.out.println("   s1    "+s1);
			ar.add(Integer.parseInt(s1));
		}
		return ar;
	}
	public static boolean isPrime(int n){

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
		String s1 = Integer.toString(n);
		if(s1.length() == 1 && isPrime(n)){
			return true;
		}
		if(!isPrime(n)){
			return false;
		}
		for(int as : combi(n)){
			if(!isPrime(as)){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(nthCircularPrime(5));
		// System.out.println(isn(3));
	}

}
